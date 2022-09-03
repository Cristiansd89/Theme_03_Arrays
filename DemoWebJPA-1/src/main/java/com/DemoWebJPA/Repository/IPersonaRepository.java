package com.DemoWebJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DemoWebJPA.Modelo.Persona;

public interface IPersonaRepository extends JpaRepository<Persona, Integer> {

}
