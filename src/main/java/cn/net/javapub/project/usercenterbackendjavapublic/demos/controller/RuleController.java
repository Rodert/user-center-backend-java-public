package cn.net.javapub.project.usercenterbackendjavapublic.demos.controller;

import cn.net.javapub.project.usercenterbackendjavapublic.demos.common.BaseResponse;
import cn.net.javapub.project.usercenterbackendjavapublic.demos.common.ResultUtils;
import cn.net.javapub.project.usercenterbackendjavapublic.demos.domain.Rule;
import cn.net.javapub.project.usercenterbackendjavapublic.demos.domain.request.UserSaveRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rule")
public class RuleController {

    @GetMapping("")
    public BaseResponse<List<Rule>> getRule(Integer current, Integer pageSize, HttpServletRequest request) {

        List<Rule> list = new ArrayList<>();
        for (int i = 0; i < pageSize; i++) {
            Rule rule = new Rule();
            rule.setUserAccount("userAccount" + i);
            rule.setUserPassword("userPassword" + i);
            rule.setId((long) i);
            list.add(rule);
        }
        return ResultUtils.success(list);
    }

    @PostMapping("")
    public BaseResponse<Long> SaveRule(@RequestBody UserSaveRequest userSaveRequest, HttpServletRequest request) {

        List<Rule> list = new ArrayList<>();

        return ResultUtils.success(1L);
    }

}
