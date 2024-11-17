package cn.net.javapub.usercenter.usercenterbackendjavapublic.controller;

import cn.net.javapub.usercenter.usercenterbackendjavapublic.model.UserLoginRequest;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// http://localhost:8000/api/login/account?token%20=%20123
// http://localhost:8000/api/currentUser?token%20=%20123
@Controller
@RequestMapping("api")
public class DemoController {

    @RequestMapping("login/account")
    @ResponseBody
    public String account(UserLoginRequest req) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("currentAuthority", "admin");
        jsonObject.put("status", "ok");
        jsonObject.put("type", "account");
        return jsonObject.toString();
    }
}
