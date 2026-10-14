package com.desarrolloweb.entornoservidor.tema2practica1.service;

import java.util.List;
import com.desarrolloweb.entornoservidor.tema2practica1.model.Treatment;

public interface ITreatmentService {
    // Busca un tratamiento por su id
    Treatment findById(Long id);

    // Devuelve la lista de todos los tratamientos
    List<Treatment> findAll();

    // Guarda un tratamiento nuevo o actualiza uno existente
    Treatment save(Treatment treatment);

    // Devuelve la lista de tratamientos asociados a un historial médico a traves de su id
    List<Treatment> getTreatmentsByMedicalRecordId(Long recordId);
}    