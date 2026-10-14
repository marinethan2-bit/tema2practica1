package com.desarrolloweb.entornoservidor.tema2practica1.service;

import java.util.List;
import com.desarrolloweb.entornoservidor.tema2practica1.model.Patient;

public interface IPatientService {
    // Busca un paciente por su id
    Patient getById(Long id);

    // Devuelve la lista de todos los pacientes
    List<Patient> getAll();

    // Guarda un paciente nuevo o actualiza uno existente
    Patient add(Patient patient);
}