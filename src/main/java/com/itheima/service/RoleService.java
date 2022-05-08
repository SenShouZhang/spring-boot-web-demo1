package com.itheima.service;

import com.itheima.pojo.Role;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* @author zhang
* @description 针对表【t_role】的数据库操作Service
* @createDate 2022-05-01 23:59:02
*/
@Transactional
@SuppressWarnings("all")
public interface RoleService extends IService<Role> {
}
