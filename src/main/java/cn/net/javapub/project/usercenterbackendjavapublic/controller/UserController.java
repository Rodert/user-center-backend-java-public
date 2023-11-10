package cn.net.javapub.project.usercenterbackendjavapublic.controller;

import cn.net.javapub.project.usercenterbackendjavapublic.annotation.ResponseResult;
import cn.net.javapub.project.usercenterbackendjavapublic.model.request.user.UserLoginRequest;
import cn.net.javapub.project.usercenterbackendjavapublic.model.response.user.OutLoginResponse;
import cn.net.javapub.project.usercenterbackendjavapublic.model.response.user.UserLoginResponse;
import cn.net.javapub.project.usercenterbackendjavapublic.model.response.user.info.UserInfoResponse;
import com.alibaba.fastjson2.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
@ResponseResult
public class UserController {

    @RequestMapping("/login/account")
    @ResponseBody
    public UserLoginResponse login(UserLoginRequest userLoginRequest) {
        System.out.println(userLoginRequest);
        UserLoginResponse userLoginResponse = new UserLoginResponse();
        userLoginResponse.setStatus("ok");
        userLoginResponse.setType("account");
        userLoginResponse.setCurrentAuthority("admin");
        return userLoginResponse;
    }

    @GetMapping("/currentUser")
    @ResponseBody
    public UserInfoResponse getCurrentUser() {
        String responseStr = "{\"success\":true,\"data\":{\"name\":\"Serati Ma\",\"avatar\":\"https://gw.alipayobjects.com/zos/antfincdn/XAosXuNZyF/BiazfanxmamNRoxxVxka.png\",\"userid\":\"00000001\",\"email\":\"antdesign@alipay.com\",\"signature\":\"海纳百川，有容乃大\",\"title\":\"交互专家\",\"group\":\"蚂蚁金服－某某某事业群－某某平台部－某某技术部－UED\",\"tags\":[{\"key\":\"0\",\"label\":\"很有想法的\"},{\"key\":\"1\",\"label\":\"专注设计\"},{\"key\":\"2\",\"label\":\"辣~\"},{\"key\":\"3\",\"label\":\"大长腿\"},{\"key\":\"4\",\"label\":\"川妹子\"},{\"key\":\"5\",\"label\":\"海纳百川\"}],\"notifyCount\":12,\"unreadCount\":11,\"country\":\"China\",\"access\":\"admin\",\"geographic\":{\"province\":{\"label\":\"浙江省\",\"key\":\"330000\"},\"city\":{\"label\":\"杭州市\",\"key\":\"330100\"}},\"address\":\"西湖区工专路 77 号\",\"phone\":\"0752-268888888\"}}";
        return JSON.parseObject(responseStr, UserInfoResponse.class);
    }

    @PostMapping("/login/outLogin")
    @ResponseBody
    public OutLoginResponse outLogin() {
        String responseStr = "{\"data\":{},\"success\":true}";
        return JSON.parseObject(responseStr, OutLoginResponse.class);
    }
}
