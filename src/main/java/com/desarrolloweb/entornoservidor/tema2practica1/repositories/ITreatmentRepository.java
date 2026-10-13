package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.List;
import com.desarrolloweb.entornoservidor.tema2practica1.model.Treatment;

public interface ITreatmentRepository {

    Treatment findById(Long id);

    List<Treatment> findAll();

    Treatment save(Treatment treatment);
}