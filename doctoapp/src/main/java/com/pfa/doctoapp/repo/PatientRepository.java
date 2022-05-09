package com.pfa.doctoapp.repo;


import com.pfa.doctoapp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository <Patient,Long> {
}
