package com.itheima.controller;

import com.itheima.pojo.Role;
import com.itheima.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 角色表控制器接口
 *
 * @author zhang
 * @date 2022/05/02
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    @SuppressWarnings("all")
    private RoleService roleService;

    @GetMapping
    public List<Role> query() {
        return roleService.list(null);
    }
}
