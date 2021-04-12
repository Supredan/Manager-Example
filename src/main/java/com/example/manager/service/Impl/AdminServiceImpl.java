package com.example.manager.service.Impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
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
    public Admin findByAdminNaPs(Admin admin) {
        return adminMapper.selectOne(
                new QueryWrapper<Admin>()
                .eq("username", admin.getUsername())
                .eq("password", admin.getPassword()));
    }

    @Override
    public int updateByAdmin(Admin admin) {
        return adminMapper.updateById(admin);
    }

}
