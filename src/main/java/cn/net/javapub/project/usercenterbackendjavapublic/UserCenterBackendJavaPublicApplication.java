package cn.net.javapub.project.usercenterbackendjavapublic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class UserCenterBackendJavaPublicApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterBackendJavaPublicApplication.class, args);
    }

}
