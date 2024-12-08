package cn.net.javapub.usercenter.usercenterbackendjavapublic.model;

import lombok.Data;

@Data
public class UserCurrentResponse {

    private Long id;
    private String nickname;
    private String name;
    private String phone;
    private Integer age;
    private String role;
    private String planetCode;

}
