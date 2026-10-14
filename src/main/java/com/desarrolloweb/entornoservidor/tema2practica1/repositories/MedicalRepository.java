package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.desarrolloweb.entornoservidor.tema2practica1.model.MedicalRecord;

@Repository 
public class MedicalRepository implements IMedicalRecordRepository{

    @Override
    public MedicalRecord findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<MedicalRecord> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public MedicalRecord save(MedicalRecord medicalRecord) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
    
}
