package com.pfa.doctoapp.service;

import com.pfa.doctoapp.model.Doctor;
import com.pfa.doctoapp.repo.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorServiceInterface {
    private final DoctorRepository doctorRepo;

    @Autowired
    public DoctorServiceImpl(DoctorRepository doctorRepo) {
        this.doctorRepo = doctorRepo;
    }



    public List<Doctor> findAllDoctors() {
        return doctorRepo.findAll();
    }




}

