package cn.net.javapub.usercenter.usercenterbackendjavapublic.model.demo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLoginRequest implements Serializable {
    private String username;
    private String password;
    private String type;
    private boolean autoLogin;

}
