package com.pfa.doctoapp.service;

import com.pfa.doctoapp.Exception.ResourcesNotfoundException;
import com.pfa.doctoapp.model.Appointment;
import com.pfa.doctoapp.repo.AppointmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AppointmentServiceImpl implements  AppointmentServiceInterface{
    private AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public List<Appointment> findAllAppointments() {
        return appointmentRepository.findAll();

    }

    @Override
    public Appointment AddAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment findAppointmentById(Long id) {
        return appointmentRepository.findById(id).orElseThrow(()-> new ResourcesNotfoundException("Appointment doesn't exist with id:"+ id));

    }



    @Override
    public Map<String, Boolean> deleteAppointment(Long id) {
        Appointment appointment=findAppointmentById(id);
        appointmentRepository.delete(appointment);
        Map<String,Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return response;
    }
    @Override
    public List<Appointment> findAppointmentByDoctor(String doctor) {
        return appointmentRepository.findAllByDoctor(doctor);
    }
}
