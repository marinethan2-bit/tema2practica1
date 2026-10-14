package com.desarrolloweb.entornoservidor.tema2practica1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.desarrolloweb.entornoservidor.tema2practica1.model.MedicalRecord;
import com.desarrolloweb.entornoservidor.tema2practica1.repositories.IMedicalRecordRepository;

public class MedicalRecordServiceAlternative implements IMedicalRecordService{
    
    @Autowired
    private IMedicalRecordRepository medicalRecordRepository;

    @Override
    public MedicalRecord getById(Long id) {
        // Busca un historial médico por su id
        return medicalRecordRepository.getById(id);
    }

    @Override
    public List<MedicalRecord> getAll() {
        // Devuelve todos los historiales médicos
        return medicalRecordRepository.getAll();
    }

    @Override
    public MedicalRecord add(MedicalRecord medicalRecord) {
        // Guarda un historial médico nuevo o actualiza uno existente
        return medicalRecordRepository.add(medicalRecord);
    }

    @Override
    public List<MedicalRecord> getRecordsByPatientId(Long patientId) {
        // Busca los historiales médicos asociados a un paciente
        List<MedicalRecord> records = new ArrayList<>();

        for (MedicalRecord record : medicalRecordRepository.getAll()) {
            if (record.getPatientId() != null
                    && record.getPatientId().equals(patientId)) {
                records.add(record);
            }
        }

        return records;
    }
}
