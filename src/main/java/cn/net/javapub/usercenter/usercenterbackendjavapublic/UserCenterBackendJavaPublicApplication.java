package cn.net.javapub.usercenter.usercenterbackendjavapublic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.net.javapub.usercenter.usercenterbackendjavapublic.mapper")
public class UserCenterBackendJavaPublicApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterBackendJavaPublicApplication.class, args);
    }

}
