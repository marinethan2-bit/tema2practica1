package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.desarrolloweb.entornoservidor.tema2practica1.model.Patient;

@Repository
public class PatientRepository implements IPatientRepository {

    @Override
    public Patient getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public List<Patient> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Patient add(Patient patient) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}
