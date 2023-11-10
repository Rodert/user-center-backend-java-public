package cn.net.javapub.project.usercenterbackendjavapublic.controller;

import cn.net.javapub.project.usercenterbackendjavapublic.annotation.ResponseResult;
import cn.net.javapub.project.usercenterbackendjavapublic.model.common.BizException;
import cn.net.javapub.project.usercenterbackendjavapublic.model.common.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@ResponseResult
public class TestController {

    @GetMapping("/test")
    public Map<String, Object> test(HttpServletRequest request) {
        HashMap<String, Object> data = new HashMap<>();
        data.put("info", "测试成功");
        return data;
    }

    @GetMapping("/fail")
    public R error() {
        int res = 0; // 查询结果数
        if (res == 0) {
            return R.fail(10001, "没有数据");
        }
        return R.success(res);
    }

    @GetMapping("/fail2")
    public Integer error2() {
        int res = 0; // 查询结果数
        if (res == 0) {
            throw new BizException("没有数据");
        }
        return res;
    }


}
