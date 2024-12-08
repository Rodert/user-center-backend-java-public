package cn.net.javapub.usercenter.usercenterbackendjavapublic.model;

import lombok.Data;

@Data
public class UserLoginRequest {
    private String name;
    private String password;
}
