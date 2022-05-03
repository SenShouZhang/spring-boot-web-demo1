package com.itheima;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import com.itheima.vo.QueryPageBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootWebDemoApplicationTests {
    @Autowired
    UserMapper userMapper;

    @DisplayName("测试mybatis-plus操作")
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
    }
    @DisplayName("测试mybatis-plus2操作")
    @Test
    void test02() {
        Page<User> page = new Page<>(1,5);
        Page<User> userPage = userMapper.selectPage(page, null);
        List<User> records = userPage.getRecords();
        for (User record : records) {
            System.out.println(record);
        }
    }
}
