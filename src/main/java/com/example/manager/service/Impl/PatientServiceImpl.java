package com.example.manager.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.manager.mapper.PatientMapper;
import com.example.manager.pojo.Patient;
import com.example.manager.service.PatientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PatientServiceImpl implements PatientService {
    @Resource
    private PatientMapper patientMapper;

    @Override
    public Patient findByPatientNaPs(Patient patient) {
        return patientMapper.selectOne(
                new QueryWrapper<Patient>()
                        .eq("username", patient.getUsername())
                        .eq("password", patient.getPassword()));
    }

    @Override
    public Patient findById(Integer id) {
        return patientMapper.selectById(id);
    }

    @Override
    public int updateByPatient(Patient patient) {
        return patientMapper.updateById(patient);
    }
}
