package com.example.accessingdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
}
