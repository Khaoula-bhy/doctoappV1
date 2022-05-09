package com.pfa.doctoapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Patient")

@Getter
@Setter
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_patient")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "num_tel")
    private Long num_tel;

}
