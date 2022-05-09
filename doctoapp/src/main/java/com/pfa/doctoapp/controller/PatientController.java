package com.pfa.doctoapp.controller;


import com.pfa.doctoapp.model.Doctor;
import com.pfa.doctoapp.model.Patient;
import com.pfa.doctoapp.service.PatientServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PatientController {
    private final PatientServiceInterface patientServiceInterface;

    @Autowired
    public PatientController(PatientServiceInterface patientServiceInterface) {
        this.patientServiceInterface = patientServiceInterface;
    }
    @GetMapping("/patients")
    public ResponseEntity<List<Patient>> findAllPatients(){
        List<Patient> patients = patientServiceInterface.findAllPatients();
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }
}
