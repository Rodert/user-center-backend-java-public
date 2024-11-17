package cn.net.javapub.usercenter.usercenterbackendjavapublic.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author author
 * @since 2024-11-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 昵称
     */
    @TableField("nickname")
    private String nickname;

    @TableField("name")
    private String name;

    @TableField("password")
    private String password;

    @TableField("email")
    private String email;

    // 年龄
    @TableField("age")
    private Integer age;

    @TableField("phone")
    private String phone;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;

    @TableField("role")
    private String role;

    /**
     * 星球ID
     */
    @TableField("planet_code")
    private String planetCode;

    @TableField("is_delete")
    private Integer isDelete;

}
