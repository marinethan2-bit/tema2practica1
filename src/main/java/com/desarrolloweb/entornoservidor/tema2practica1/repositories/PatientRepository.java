package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.desarrolloweb.entornoservidor.tema2practica1.model.Patient;

@Repository
public class PatientRepository implements IPatientRepository {

    @Override
    public Patient findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Patient> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Patient save(Patient patient) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

}
