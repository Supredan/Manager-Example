package com.example.manager.service;

import com.example.manager.pojo.Admin;
import com.example.manager.pojo.Patient;

public interface PatientService {
    Patient findByPatientNaPs(Patient patient);

    Patient findById(Integer id);

    int updateByPatient(Patient patient);
}
