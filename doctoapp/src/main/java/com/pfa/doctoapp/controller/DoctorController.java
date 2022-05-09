package com.pfa.doctoapp.controller;

import com.pfa.doctoapp.model.Doctor;
import com.pfa.doctoapp.service.DoctorServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")

@RestController
@RequestMapping("/api")
public class DoctorController {

    private final DoctorServiceInterface doctorServiceInterface;

    @Autowired
    public DoctorController(DoctorServiceInterface doctorServiceInterface) {
        this.doctorServiceInterface = doctorServiceInterface;
    }




}


