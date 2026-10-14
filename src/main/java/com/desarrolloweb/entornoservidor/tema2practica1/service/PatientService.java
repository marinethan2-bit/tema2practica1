package com.desarrolloweb.entornoservidor.tema2practica1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrolloweb.entornoservidor.tema2practica1.model.Patient;
import com.desarrolloweb.entornoservidor.tema2practica1.repositories.IPatientRepository;

@Service
public class PatientService implements IPatientService{

    @Autowired
    private IPatientRepository patientRepository;

    @Override
    public Patient getById(Long id) {
        // Busca un paciente por su id
        return patientRepository.getById(id);
    }

    @Override
    public List<Patient> getAll() {
        // Devuelve todos los pacientes
        return patientRepository.getAll();
    }

    @Override
    public Patient add(Patient patient) {
        // Guarda un paciente nuevo o actualiza uno existente
        return patientRepository.add(patient);
    }
    
}
