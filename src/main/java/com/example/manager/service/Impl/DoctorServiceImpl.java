package com.example.manager.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.manager.mapper.DoctorMapper;
import com.example.manager.pojo.Doctor;
import com.example.manager.service.DoctorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Resource
    private DoctorMapper doctorMapper;

    @Override
    public Doctor findByDoctorNaPs(Doctor doctor) {
        return doctorMapper.selectOne(
                new QueryWrapper<Doctor>()
                .eq("username", doctor.getUsername())
                .eq("password", doctor.getPassword()));
    }

    @Override
    public Doctor findById(Integer id) {
        return doctorMapper.selectById(id);
    }

    @Override
    public int updateByDoctor(Doctor doctor) {
        return doctorMapper.updateById(doctor);
    }


}
