package cn.net.javapub.usercenter.usercenterbackendjavapublic.controller;

import cn.net.javapub.usercenter.usercenterbackendjavapublic.common.BaseResponse;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.common.ResultUtils;
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
        JSONObject result = new JSONObject();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("currentAuthority", "admin");
        jsonObject.put("status", "ok");
        jsonObject.put("type", "account");

        result.put("code", 200);
        result.put("data", jsonObject);

//        return jsonObject.toString();
        return result.toString();
    }
}
