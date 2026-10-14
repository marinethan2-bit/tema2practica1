package com.desarrolloweb.entornoservidor.tema2practica1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrolloweb.entornoservidor.tema2practica1.model.Treatment;
import com.desarrolloweb.entornoservidor.tema2practica1.repositories.ITreatmentRepository;

@Service
public class TreatmentService implements ITreatmentService{
    
    @Autowired
    private ITreatmentRepository treatmentRepository;

    @Override
    public Treatment getById(Long id) {
        // Busca un tratamiento por su id
        return treatmentRepository.getById(id);
    }

    @Override
    public List<Treatment> getAll() {
        // Devuelve todos los tratamientos
        return treatmentRepository.getAll();
    }

    @Override
    public Treatment add(Treatment treatment) {
        // Guarda un tratamiento nuevo o actualiza uno existente
        return treatmentRepository.add(treatment);
    }

    @Override
    public List<Treatment> getTreatmentsByMedicalRecordId(Long recordId) {
        // Busca los tratamientos asociados a un historial médico
        List<Treatment> treatments = new ArrayList<>();

        for (Treatment treatment : treatmentRepository.getAll()) {
            if (treatment.getMedicalRecordId().equals(recordId)) {
                treatments.add(treatment);
            }
        }

        return treatments;
    }
}
