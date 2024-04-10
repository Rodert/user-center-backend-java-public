package cn.net.javapub.project.usercenterbackendjavapublic.demos.domain.request;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author <a href="https://github.com/Rodert">JavaPub</a>
 * @from <a href="http://javapub.net.cn">编程指南</a>
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String userPassword;

}
