package cn.net.javapub.usercenter.usercenterbackendjavapublic.service;

import cn.net.javapub.usercenter.usercenterbackendjavapublic.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author author
 * @since 2024-11-17
 */
public interface IUserService extends IService<User> {

    long userRegister(String name, String password, String checkPassword, String nickname, Integer age, String role, String planetCode);

    User userLogin(String name, String password);

    User selectUser(Long id);
}
