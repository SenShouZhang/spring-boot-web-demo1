package com.itheima.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户表
 *
 * @TableName t_user
 */
@TableName(value = "t_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    /**
     * 用户ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 用户拥有多个角色
     */
    @TableField(exist = false)
    private List<Role> roles;

    /**
     * 用户拥有多个角色ID
     */
    @TableField(exist = false)
    private List<String> roleIds;
    /**
     * 创建的时间
     */
    @TableField(value = "createTime")
    private LocalDateTime createTime;

    /**
     * 更新的时间
     */
    @TableField(value = "updateTime")
    private LocalDateTime updateTime;
}