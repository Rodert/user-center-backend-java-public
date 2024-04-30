package cn.net.javapub.project.usercenterbackendjavapublic.demos.domain.request;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 用户删除请求体
 *
 * @author <a href="https://github.com/Rodert">JavaPub</a>
 * @from <a href="http://javapub.net.cn">编程指南</a>
 */
@Data
public class UserDeleteRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;


    private List<Long> ids;


    private String method;

}

// [加入编程导航](http://javapub.net.cn) 入门捷径+交流答疑+项目实战+求职指导，帮你自学编程不走弯路