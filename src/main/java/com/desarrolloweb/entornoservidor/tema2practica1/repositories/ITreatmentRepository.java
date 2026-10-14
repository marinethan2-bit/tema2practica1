package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.List;
import com.desarrolloweb.entornoservidor.tema2practica1.model.Treatment;

public interface ITreatmentRepository {
    // Busca un tratamiento por su id
    Treatment getById(Long id);

    // Devuelve la lista de todos los tratamientos
    List<Treatment> getAll();

    // Guarda un tratamiento nuevo o actualiza uno existente
    Treatment add(Treatment treatment);
}