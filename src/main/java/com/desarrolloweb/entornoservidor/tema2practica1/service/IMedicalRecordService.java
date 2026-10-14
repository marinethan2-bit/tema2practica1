package com.desarrolloweb.entornoservidor.tema2practica1.service;

import java.util.List;
import com.desarrolloweb.entornoservidor.tema2practica1.model.MedicalRecord;

public interface IMedicalRecordService {
    // Busca un historial médico por su id
    MedicalRecord findById(Long id);

    // Devuelve la lista de todos los historiales médicos
    List<MedicalRecord> findAll();

    // Guarda un historial médico nuevo o actualiza uno existente
    MedicalRecord save(MedicalRecord medicalRecord);

    // Devuelve la lista de historiales médicos de un paciente concreto a traves de su id
    List<MedicalRecord> getRecordsByPatientId(Long patientId);
}