package com.itheima.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.vo.QueryPageBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhang
 * @description 针对表【t_user】的数据库操作Mapper
 * @createDate 2022-05-01 23:59:02
 * @Entity com.itheima.pojo.User
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    /**
     * 分页查询所有用户以及对应的角色信息
     *
     * @param bean 前端
     * @return {@link Page}<{@link User}>
     */
    List<User> findUserAndRole(@Param("bean") QueryPageBean bean);

    /**
     * 添加用户信息和角色信息
     *
     * @param uid     用户ID
     * @param roleIds 用户角色ID
     * @return int
     */
    int insertUsersAndRoles(@Param("uid") Integer uid, @Param("roleIds") List<String> roleIds);

    /**
     * 删除对应ID的角色
     *
     * @param uid 用户ID
     * @return int
     */
    int deleteUserAndRoleById(Integer uid);

    /**
     * 查询总记录数
     *
     * @param bean 前端
     * @return {@link Long}
     */
    Long findUserTotal(@Param("bean") QueryPageBean bean);
}




