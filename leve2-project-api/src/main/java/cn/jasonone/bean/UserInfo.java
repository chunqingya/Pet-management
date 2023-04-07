package cn.jasonone.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * 用户信息表
 * @TableName user_info
 */
@Data
public class UserInfo implements Serializable {
    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐值
     */
    private String salt;

    private static final long serialVersionUID = 1L;
}