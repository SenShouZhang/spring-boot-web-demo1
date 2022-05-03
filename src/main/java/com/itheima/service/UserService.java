package com.itheima.service;

import com.itheima.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.vo.AddUser;
import com.itheima.vo.PageResult;
import com.itheima.vo.QueryPageBean;
import com.itheima.vo.UpdateUser;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhang
 * @description 针对表【t_user】的数据库操作Service
 * @createDate 2022-05-01 23:59:02
 */
@Transactional
@SuppressWarnings("all")
public interface UserService extends IService<User> {
    /**
     * 分页查询
     *
     * @param queryPageBean 前端传过来的JSON参数转化为JAVA对象
     * @return {@link PageResult}
     */
    PageResult selectByPage(QueryPageBean queryPageBean);

    /**
     * 添加用户
     *
     * @param addUser 前端传过来的JSON参数转化为JAVA对象
     * @return {@link Double}
     */
    Boolean addUser(AddUser addUser);

    /**
     * 修改用户和角色
     *
     * @param updateUser 前端传过来的JSON
     * @return int
     */
    Boolean updateUsersAndRoles(UpdateUser updateUser);

    /**
     * 删除用户以及对应角色信息
     *
     * @param uid 用户ID
     * @return {@link Boolean}
     */
    Boolean deleteAll(String uid);
}
