package com.itheima.controller;

import com.itheima.service.UserService;
import com.itheima.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 用户表控制器接口
 *
 * @author zhang
 * @date 2022/05/02
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    @SuppressWarnings("all")
    private UserService userService;

    @PostMapping("/find")
    public Result find(@RequestBody QueryPageBean pageBean) {
        PageResult pageResult = userService.selectByPage(pageBean);
        boolean flag = pageResult != null;
        String msg = pageResult != null ? "查询成功" : "查询失败";
        return new Result(flag, msg, pageResult);
    }

    @PostMapping
    public Result add(@RequestBody AddUser addUser) {
        Boolean flag = userService.addUser(addUser);
        String msg = flag ? "添加成功" : "添加失败";
        return new Result(flag, msg, null);
    }

    @PutMapping
    public Result update(@RequestBody UpdateUser updateUser) {
        Boolean flag = userService.updateUsersAndRoles(updateUser);
        String msg = flag ? "修改成功" : "修改失败";
        return new Result(flag, msg, null);
    }

    @DeleteMapping("/{uid}")
    public Result delete(@PathVariable String uid) {
        Boolean flag = userService.deleteAll(uid);
        String msg = flag ? "删除成功" : "删除失败";
        return new Result(flag, msg, null);
    }
}
