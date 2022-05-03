package com.itheima.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import com.itheima.mapper.UserMapper;
import com.itheima.vo.AddUser;
import com.itheima.vo.PageResult;
import com.itheima.vo.QueryPageBean;
import com.itheima.vo.UpdateUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhang
 * @description 针对表【t_user】的数据库操作Service实现
 * @createDate 2022-05-01 23:59:02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {
    @Autowired
    @SuppressWarnings("all")
    private UserMapper userMapper;

    @Override
    public PageResult selectByPage(QueryPageBean queryPageBean) {
        List<User> list = userMapper.findUserAndRole(queryPageBean);
        Long total = userMapper.findUserTotal(queryPageBean);
        return new PageResult(total, list);
    }

    @Override
    public Boolean addUser(AddUser addUser) {
        User user = new User();
        user.setUsername(addUser.getUsername());
        user.setEmail(addUser.getEmail());
        user.setPassword(addUser.getPassword());
        user.setRemark(addUser.getRemark());
        user.setRoleIds(addUser.getRoleIds());
        int i = userMapper.insert(user);
        Integer userId = user.getId();
        int j = userMapper.insertUsersAndRoles(userId, user.getRoleIds());
        return i != 0 && j != 0;
    }

    @Override
    public Boolean updateUsersAndRoles(UpdateUser updateUser) {
        User user = new User();
        user.setId(updateUser.getId());
        user.setUsername(updateUser.getUsername());
        user.setEmail(updateUser.getEmail());
        user.setPassword(updateUser.getPassword());
        user.setRoleIds(updateUser.getRoleIds());
        user.setRemark(updateUser.getRemark());
        int i = userMapper.updateById(user);
        userMapper.deleteUserAndRoleById(user.getId());
        int j = userMapper.insertUsersAndRoles(user.getId(), user.getRoleIds());
        return i != 0 && j != 0;
    }

    @Override
    public Boolean deleteAll(String uid) {
        int userId = Integer.parseInt(uid);
        int i = userMapper.deleteUserAndRoleById(userId);
        int j = userMapper.deleteById(userId);
        return i != 0 && j != 0;
    }
}




