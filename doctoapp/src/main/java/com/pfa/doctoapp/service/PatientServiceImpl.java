package com.pfa.doctoapp.service;

import com.pfa.doctoapp.model.Patient;
import com.pfa.doctoapp.repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientServiceInterface {
    private final PatientRepository patientRepo;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepo) {
        this.patientRepo = patientRepo;
    }






    public List<Patient> findAllPatients() {
        return patientRepo.findAll();
    }

}
