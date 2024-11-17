package cn.net.javapub.usercenter.usercenterbackendjavapublic.model;

import lombok.Data;

@Data
public class UserRegisterRequest {
    private String name;
    private String password;
    private String checkPassword;
    private String nickname;
    private Integer age;
    private String role;
    private String planetCode;
}
