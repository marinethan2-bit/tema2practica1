package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.desarrolloweb.entornoservidor.tema2practica1.model.Treatment;

@Repository 
public class TreatmentRepository implements ITreatmentRepository{

    @Override
    public Treatment getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public List<Treatment> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Treatment add(Treatment treatment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    
}
