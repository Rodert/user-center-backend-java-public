package cn.net.javapub.usercenter.usercenterbackendjavapublic.controller;


import cn.net.javapub.usercenter.usercenterbackendjavapublic.common.BaseResponse;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.common.ErrCode;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.common.ResultUtils;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.exception.BusinessException;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.model.User;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.model.UserRegisterRequest;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.service.IUserService;
import io.micrometer.common.util.StringUtils;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author author
 * @since 2024-11-17
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @PostMapping("/register")
    public BaseResponse<Long> register(@RequestBody UserRegisterRequest userRegisterRequest) {
        // check 校验
        if (userRegisterRequest == null) {
            throw new BusinessException(ErrCode.PARAM_ERROR);
        }

        String name = userRegisterRequest.getName();
        String password = userRegisterRequest.getPassword();
        String checkPassword = userRegisterRequest.getCheckPassword();
        String nickname = userRegisterRequest.getNickname();
        Integer age = userRegisterRequest.getAge();
        String role = userRegisterRequest.getRole();
        String planetCode = userRegisterRequest.getPlanetCode();

        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(password) || StringUtils.isEmpty(checkPassword) ||
                StringUtils.isEmpty(nickname) || StringUtils.isEmpty(role) || StringUtils.isEmpty(planetCode)) {
            throw new BusinessException(ErrCode.PARAM_ERROR);
        }


        long userRegister = userService.userRegister(name, password, checkPassword, nickname, age, role, planetCode);
        return ResultUtils.success(userRegister);
    }

}
