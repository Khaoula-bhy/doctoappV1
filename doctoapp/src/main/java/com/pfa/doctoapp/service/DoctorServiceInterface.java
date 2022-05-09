package com.pfa.doctoapp.service;

import com.pfa.doctoapp.model.Doctor;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface DoctorServiceInterface {
       List<Doctor> findAllDoctors();


}
