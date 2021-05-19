package com.example.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AlumnoService  {

    private final AlumnoRepository alumnoRepository;


    @Autowired
    public AlumnoService(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    public Alumno addAlumno(Alumno alumno){
         return alumnoRepository.save(alumno);
    }

    public List<Alumno> findAllAlumnos(){
        return alumnoRepository.findAll();
    }

    public Optional<Alumno> findAlumnoById(Integer id){

        return alumnoRepository.findById(id);
    }


}
