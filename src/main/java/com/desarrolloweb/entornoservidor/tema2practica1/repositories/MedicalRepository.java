package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.desarrolloweb.entornoservidor.tema2practica1.model.MedicalRecord;

@Repository 
public class MedicalRepository implements IMedicalRecordRepository{

    @Override
    public MedicalRecord getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public List<MedicalRecord> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public MedicalRecord add(MedicalRecord medicalRecord) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    





    // // Lista donde se guardan los historiales médicos.
    // private List<MedicalRecord> medicalRecords = new ArrayList<>();

    // // Contador para generar identificadores.
    // private AtomicLong nextId = new AtomicLong(1);

    // // Busca un historial médico por su identificador.
    // @Override
    // public MedicalRecord getById(Long id) {
    //     for (MedicalRecord record : medicalRecords) {
    //         if (record.getId().equals(id)) {
    //             return record;
    //         }
    //     }

    //     return null;
    // }

    // // Devuelve todos los historiales médicos.
    // @Override
    // public List<MedicalRecord> getAll() {
    //     return medicalRecords;
    // }

    // // Añade un historial médico nuevo o actualiza uno existente.
    // @Override
    // public MedicalRecord add(MedicalRecord medicalRecord) {

    //     // Si no tiene identificador, se le asigna uno.
    //     if (medicalRecord.getId() == null) {
    //         medicalRecord.setId(nextId.getAndIncrement());
    //         medicalRecords.add(medicalRecord);
    //         return medicalRecord;
    //     }

    //     // Si ya existe, se actualiza.
    //     for (int i = 0; i < medicalRecords.size(); i++) {
    //         if (medicalRecords.get(i).getId()
    //                 .equals(medicalRecord.getId())) {
    //             medicalRecords.set(i, medicalRecord);
    //             return medicalRecord;
    //         }
    //     }

    //     // Si no existe, se añade a la lista.
    //     medicalRecords.add(medicalRecord);
    //     return medicalRecord;
    // }

}
