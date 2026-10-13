package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.List;
import com.desarrolloweb.entornoservidor.tema2practica1.model.Patient;

public interface IPatientRepository {

    Patient findById(Long id);

    List<Patient> findAll();

    Patient save(Patient patient);
}