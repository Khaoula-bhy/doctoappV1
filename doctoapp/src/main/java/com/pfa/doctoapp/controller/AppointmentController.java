package com.pfa.doctoapp.controller;

import com.pfa.doctoapp.model.Appointment;
import com.pfa.doctoapp.service.AppointmentServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AppointmentController {

    private final AppointmentServiceInterface appointmentServiceInterface;

    @Autowired
    public AppointmentController(AppointmentServiceInterface appointmentServiceInterface) {
        this.appointmentServiceInterface = appointmentServiceInterface;
    }

        @GetMapping("/appointments")
        public ResponseEntity<List<Appointment>> getAllAppointments(){
            List<Appointment> appointments= appointmentServiceInterface.findAllAppointments();
            return new ResponseEntity<>(appointments, HttpStatus.OK);
        }
        @GetMapping("/appointment/{id}")
        public ResponseEntity<Appointment> getAppointmentById(@PathVariable Long id){
            Appointment appointment =appointmentServiceInterface.findAppointmentById(id);
            return new ResponseEntity<>(appointment, HttpStatus.OK);

        }
    @PostMapping("/appointment")
    public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment appointment){
       Appointment addAppointment=appointmentServiceInterface.AddAppointment(appointment);
       return new ResponseEntity<>(addAppointment,HttpStatus.OK);
    }

    @DeleteMapping("/appointment/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteAppointment(@PathVariable Long id){
        Map<String,Boolean> response=appointmentServiceInterface.deleteAppointment(id);
        return  ResponseEntity.ok(response);
    }
    @GetMapping("/appointments/{nameDoctor}")
    public ResponseEntity<List<Appointment>> getAppointmentByDoctor(@PathVariable String nameDoctor){
        List<Appointment> appointments =appointmentServiceInterface.findAppointmentByDoctor(nameDoctor);
        return new ResponseEntity<>(appointments, HttpStatus.OK);

    }
}
