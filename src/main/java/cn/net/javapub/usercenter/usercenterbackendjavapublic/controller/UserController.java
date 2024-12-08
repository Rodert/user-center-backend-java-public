package cn.net.javapub.usercenter.usercenterbackendjavapublic.controller;


import cn.net.javapub.usercenter.usercenterbackendjavapublic.common.BaseResponse;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.common.ErrCode;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.common.ResultUtils;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.exception.BusinessException;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.model.User;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.model.UserCurrentResponse;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.model.UserLoginRequest;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.model.UserRegisterRequest;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.service.IUserService;
import io.micrometer.common.util.StringUtils;
import jakarta.annotation.Resource;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

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

        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(password) || StringUtils.isEmpty(checkPassword) || StringUtils.isEmpty(nickname) || StringUtils.isEmpty(role) || StringUtils.isEmpty(planetCode)) {
            throw new BusinessException(ErrCode.PARAM_ERROR);
        }


        long userRegister = userService.userRegister(name, password, checkPassword, nickname, age, role, planetCode);
        return ResultUtils.success(userRegister);
    }

    // admin 0; user 1;
    @PostMapping("/login")
    public BaseResponse<Long> login(@RequestBody UserLoginRequest userLoginRequest) {
        // check 校验
        if (userLoginRequest == null) {
            throw new BusinessException(ErrCode.PARAM_ERROR);
        }

        String name = userLoginRequest.getName();
        String password = userLoginRequest.getPassword();

        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(password)) {
            throw new BusinessException(ErrCode.PARAM_ERROR);
        }


        User user = userService.userLogin(name, password);
        if (user == null) {
            throw new BusinessException(ErrCode.USER_NOT_EXIST);
        }

        return ResultUtils.success(user.getId());
    }


    // 当前用户信息
    @GetMapping("/current")
    public BaseResponse<UserCurrentResponse> current() {

        // TODO 获取用户的ID

        long id = 2;

        User user = userService.selectUser(id);
        if (user == null) {
            throw new BusinessException(ErrCode.USER_NOT_EXIST);
        }

        UserCurrentResponse userCurrentResponse = new UserCurrentResponse();
        userCurrentResponse.setId(user.getId());
        userCurrentResponse.setName(user.getName());
        userCurrentResponse.setRole(user.getRole());
        userCurrentResponse.setNickname(user.getNickname());
        userCurrentResponse.setPhone(user.getPhone());
        userCurrentResponse.setAge(user.getAge());
        userCurrentResponse.setPlanetCode(user.getPlanetCode());

        return ResultUtils.success(userCurrentResponse);
    }

    @PutMapping("/logout")
    public BaseResponse<Long> logout() {

        // TODO 获取用户的ID

        long id = 2;
        return ResultUtils.success(0L);
    }

    @PostMapping("/add")
    public BaseResponse<Long> add() {

        // TODO 获取用户的ID

        long id = 2;
        return ResultUtils.success(0L);
    }

    @PostMapping("/update")
    public BaseResponse<Long> update() {

        // TODO 获取用户的ID

        long id = 2;
        return ResultUtils.success(0L);
    }

    @PostMapping("/delete")
    public BaseResponse<Long> delete() {

        // TODO 获取用户的ID

        long id = 2;
        return ResultUtils.success(0L);
    }

    @PostMapping("/list")
    public BaseResponse<Long> list() {

        // TODO 获取用户的ID

        long id = 2;
        return ResultUtils.success(0L);
    }

}
