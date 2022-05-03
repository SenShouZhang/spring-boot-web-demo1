package com.itheima.mapper;

import com.itheima.pojo.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author zhang
* @description 针对表【t_role】的数据库操作Mapper
* @createDate 2022-05-01 23:59:01
* @Entity com.itheima.pojo.Role
*/
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

}




