package com.desarrolloweb.entornoservidor.tema2practica1.service;

import java.util.List;
import com.desarrolloweb.entornoservidor.tema2practica1.model.MedicalRecord;

public interface IMedicalRecordService {
    // Busca un historial médico por su id
    MedicalRecord getById(Long id);

    // Devuelve la lista de todos los historiales médicos
    List<MedicalRecord> getAll();

    // Guarda un historial médico nuevo o actualiza uno existente
    MedicalRecord add(MedicalRecord medicalRecord);

    // Devuelve la lista de historiales médicos de un paciente concreto a traves de
    // su id
    List<MedicalRecord> getRecordsByPatientId(Long patientId);
}