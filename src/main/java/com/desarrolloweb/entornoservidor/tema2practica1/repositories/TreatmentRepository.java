package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.desarrolloweb.entornoservidor.tema2practica1.model.Treatment;

@Repository 
public class TreatmentRepository implements ITreatmentRepository{

    @Override
    public Treatment findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Treatment> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Treatment save(Treatment treatment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
    
}
