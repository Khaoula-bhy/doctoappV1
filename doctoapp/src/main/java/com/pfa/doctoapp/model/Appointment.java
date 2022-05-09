package com.pfa.doctoapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Appointment")
//@Data
@Getter
@Setter
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @ManyToOne
    @JoinColumn(name = "id_doc")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "id_patient")
    private Patient patient;

    @Column(name="date")
    private String date;

    @Column(name = "time")
    private String time;
}
