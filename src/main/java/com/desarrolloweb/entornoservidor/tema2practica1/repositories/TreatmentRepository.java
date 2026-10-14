package com.desarrolloweb.entornoservidor.tema2practica1.repositories;


import java.util.List;


import org.springframework.stereotype.Repository;

import com.desarrolloweb.entornoservidor.tema2practica1.model.Treatment;

@Repository 
public class TreatmentRepository implements ITreatmentRepository{

    @Override
    public Treatment getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public List<Treatment> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Treatment add(Treatment treatment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
 
    


    // // Lista donde se guardan los tratamientos.
    // private List<Treatment> treatments = new ArrayList<>();

    // // Contador para generar identificadores.
    // private AtomicLong nextId = new AtomicLong(1);

    // // Busca un tratamiento por su identificador.
    // @Override
    // public Treatment getById(Long id) {
    //     for (Treatment treatment : treatments) {
    //         if (treatment.getId().equals(id)) {
    //             return treatment;
    //         }
    //     }

    //     return null;
    // }

    // // Devuelve todos los tratamientos.
    // @Override
    // public List<Treatment> getAll() {
    //     return treatments;
    // }

    // // Añade un tratamiento nuevo o actualiza uno existente.
    // @Override
    // public Treatment add(Treatment treatment) {

    //     // Si no tiene identificador, se le asigna uno.
    //     if (treatment.getId() == null) {
    //         treatment.setId(nextId.getAndIncrement());
    //         treatments.add(treatment);
    //         return treatment;
    //     }

    //     // Si ya existe, se actualiza.
    //     for (int i = 0; i < treatments.size(); i++) {
    //         if (treatments.get(i).getId().equals(treatment.getId())) {
    //             treatments.set(i, treatment);
    //             return treatment;
    //         }
    //     }

    //     // Si no existe, se añade a la lista.
    //     treatments.add(treatment);
    //     return treatment;
    // }






}
