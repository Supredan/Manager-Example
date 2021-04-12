package com.example.manager.service;

import com.example.manager.pojo.Admin;
import com.example.manager.pojo.Doctor;

public interface DoctorService {
    Doctor findByDoctorNaPs(Doctor doctor);

    Doctor findById(Integer id);

    int updateByDoctor(Doctor doctor);
}
