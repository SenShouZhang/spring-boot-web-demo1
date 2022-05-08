package com.itheima.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.pojo.Role;
import com.itheima.service.RoleService;
import com.itheima.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhang
 * @description 针对表【t_role】的数据库操作Service实现
 * @createDate 2022-05-01 23:59:02
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
        implements RoleService {
}




