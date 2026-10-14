package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.List;
import com.desarrolloweb.entornoservidor.tema2practica1.model.Patient;

public interface IPatientRepository {
    // Busca un paciente por su id
    Patient findById(Long id);

    // Devuelve la lista de todos los pacientes
    List<Patient> findAll();

    // Guarda un paciente nuevo o actualiza uno existente
    Patient save(Patient patient);
}