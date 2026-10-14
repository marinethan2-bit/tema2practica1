package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.List;
import com.desarrolloweb.entornoservidor.tema2practica1.model.MedicalRecord;

public interface IMedicalRecordRepository {
    // Busca un historial médico por su id
    MedicalRecord findById(Long id);

    // Devuelve la lista de todos los historiales médicos
    List<MedicalRecord> findAll();

    // Guarda un historial médico nuevo o actualiza uno existente
    MedicalRecord save(MedicalRecord medicalRecord);
}