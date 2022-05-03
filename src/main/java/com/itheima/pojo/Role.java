package com.itheima.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 角色实体类表
 *
 * @TableName t_role
 */
@TableName(value = "t_role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
    /**
     * 角色ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色姓名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 关键
     */
    @TableField(value = "keyword")
    private String keyword;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;
}