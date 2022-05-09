package com.pfa.doctoapp.service;

import com.pfa.doctoapp.model.Patient;

import java.util.List;

public interface PatientServiceInterface {
    List<Patient> findAllPatients();
}
