package com.pfa.doctoapp.service;

import com.pfa.doctoapp.model.Appointment;


import java.util.List;
import java.util.Map;

public interface AppointmentServiceInterface {

    public List<Appointment> findAllAppointments();
    public Appointment AddAppointment( Appointment appointment);
    public Appointment findAppointmentById( Long id);

    public Map<String,Boolean> deleteAppointment(Long id);
    public List<Appointment> findAppointmentByDoctor(String doctor);
}
