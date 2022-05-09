package com.pfa.doctoapp.repo;

import com.pfa.doctoapp.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import javax.print.Doc;
import java.util.List;



@CrossOrigin("http://localhost:4200")

public interface DoctorRepository extends JpaRepository<Doctor,Long> {

    List<Doctor> findBySpecialityAndLocationContaining(@RequestParam String speciality, @RequestParam String location);

}
