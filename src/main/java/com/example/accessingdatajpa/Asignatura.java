package com.example.accessingdatajpa;

import javax.persistence.*;

@Entity
public class Asignatura {
    @Id
    private int id;
    public String nombre;
    public int nota;

    @ManyToOne
    private Alumno alumno;

}
