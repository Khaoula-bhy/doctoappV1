package com.pfa.doctoapp.repo;

import com.pfa.doctoapp.model.Appointment;
import com.pfa.doctoapp.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
    @Query("SELECT a FROM Appointment a WHERE a.doctor.name = :nameDoctor")
    List<Appointment> findAllByDoctor(@Param("nameDoctor") String nameDoctor);


}
