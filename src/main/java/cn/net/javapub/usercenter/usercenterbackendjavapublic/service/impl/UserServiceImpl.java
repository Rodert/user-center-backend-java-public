package cn.net.javapub.usercenter.usercenterbackendjavapublic.service.impl;

import cn.net.javapub.usercenter.usercenterbackendjavapublic.common.ErrCode;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.exception.BusinessException;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.mapper.UserMapper;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.model.User;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.micrometer.common.util.StringUtils;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.sql.Date;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author author
 * @since 2024-11-17
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    private static final String SALT = "javapub";

    @Resource
    private UserMapper userMapper;

    @Override
    public long userRegister(String name, String password, String checkPassword, String nickname, Integer age, String role, String planetCode) {
        if (StringUtils.isBlank(name) || StringUtils.isBlank(password) || StringUtils.isBlank(checkPassword) ||
                StringUtils.isBlank(nickname) || StringUtils.isBlank(role) || StringUtils.isBlank(planetCode)) {
            throw new BusinessException(ErrCode.PARAM_ERROR, "参数为空");
        }
//        if (StringUtils.isAllBlank(name, nickname, nickname, role, planetCode)) {
//            throw new BusinessException(ErrCode.PARAM_ERROR, "参数为空");
//        }

        if (name.length() < 4) {
            throw new BusinessException(ErrCode.PARAM_ERROR, "用户名过短");
        }

        if (password.length() < 6) {
            throw new BusinessException(ErrCode.PARAM_ERROR, "密码过短");
        }

        // TODO 用户密码复杂度检测

        if (!password.equals(checkPassword)) {
            throw new BusinessException(ErrCode.PARAM_ERROR, "俩次密码不一致");
        }

        // 账户不能重复
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", name);
        Long count = userMapper.selectCount(queryWrapper);
        if (count > 0) {
            throw new BusinessException(ErrCode.PARAM_ERROR, "账号重复");
        }

        // 星球编号不能重复
        queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("planet_code", planetCode);
        count = userMapper.selectCount(queryWrapper);
        if (count > 0) {
            throw new BusinessException(ErrCode.PARAM_ERROR, "编号重复");
        }

        // 密码加密
        String digestAsHexPassword = DigestUtils.md5DigestAsHex((SALT + password).getBytes());

        // 插入数据
        User user = new User();
        user.setName(name);
        user.setPassword(digestAsHexPassword);
        user.setNickname(nickname);
        user.setRole(role);
        user.setPlanetCode(planetCode);
        user.setAge(age);
        boolean saveResult = this.save(user);
        if (!saveResult) {
            return -1;
        }

        return 0;
    }
}
