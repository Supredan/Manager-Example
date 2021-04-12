package com.example.manager;

import com.example.manager.mapper.AdminMapper;
import com.example.manager.pojo.Admin;
import com.example.manager.service.Impl.AdminServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisTest {

    @Resource
    private AdminMapper adminMapper;

    @Test
    public void test () {
        System.out.println(adminMapper.selectCount(null));
    }
}
