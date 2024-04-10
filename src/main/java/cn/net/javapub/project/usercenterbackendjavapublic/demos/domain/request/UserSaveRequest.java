package cn.net.javapub.project.usercenterbackendjavapublic.demos.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author <a href="https://github.com/Rodert">JavaPub</a>
 * @from <a href="http://javapub.net.cn">编程指南</a>
 */
@Data
public class UserSaveRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 校验密码
     */
    private String method;

    /**
     * 星球编号
     */
    private String planetCode;
}

// [加入编程导航](http://javapub.net.cn) 入门捷径+交流答疑+项目实战+求职指导，帮你自学编程不走弯路