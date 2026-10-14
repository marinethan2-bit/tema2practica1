package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.List;
import com.desarrolloweb.entornoservidor.tema2practica1.model.Treatment;

public interface ITreatmentRepository {
    // Busca un tratamiento por su id
    Treatment findById(Long id);

    // Devuelve la lista de todos los tratamientos
    List<Treatment> findAll();

    // Guarda un tratamiento nuevo o actualiza uno existente
    Treatment save(Treatment treatment);
}