package cn.net.javapub.project.usercenterbackendjavapublic.demos;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author <a href="https://github.com/Rodert">JavaPub</a>
 * @from <a href="http://javapub.net.cn">编程指南</a>
 */
@SpringBootApplication
@MapperScan("cn.net.javapub.project.usercenterbackendjavapublic.demos.mapper")
public class UserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class, args);
    }

}

// https://github.com/Rodert