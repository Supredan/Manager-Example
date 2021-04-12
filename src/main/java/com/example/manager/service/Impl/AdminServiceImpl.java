package com.example.manager.service.Impl;

import com.example.manager.pojo.Admin;
import com.example.manager.mapper.AdminMapper;
import com.example.manager.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin findByAdminId(Admin admin) {
        return adminMapper.selectById(admin.getId());
    }

    @Override
    public int updateByAdmin(Admin admin) {
        return adminMapper.updateById(admin);
    }

}
