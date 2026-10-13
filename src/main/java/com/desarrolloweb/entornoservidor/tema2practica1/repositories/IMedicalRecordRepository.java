package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.List;
import com.desarrolloweb.entornoservidor.tema2practica1.model.MedicalRecord;

public interface IMedicalRecordRepository {

    MedicalRecord findById(Long id);

    List<MedicalRecord> findAll();

    MedicalRecord save(MedicalRecord medicalRecord);
}
