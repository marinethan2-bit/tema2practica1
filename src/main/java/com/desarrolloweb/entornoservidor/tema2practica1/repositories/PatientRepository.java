package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.desarrolloweb.entornoservidor.tema2practica1.model.Patient;


@Repository
public class PatientRepository implements IPatientRepository {

    @Override
    public Patient getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public List<Patient> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Patient add(Patient patient) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }




    // // Lista donde se guardan los pacientes.
    // private List<Patient> patients = new ArrayList<>();

    // // Contador para generar identificadores.
    // private AtomicLong nextId = new AtomicLong(1);

    // // Constructor que carga los pacientes desde el archivo JSON.
    // public PatientRepository() {
    //     try {
    //         // Busca el archivo patients.json en resources.
    //         ClassPathResource resource =
    //                 new ClassPathResource("patients.json");

    //         // Lee el contenido del archivo.
    //         InputStream inputStream = resource.getInputStream();

    //         // Convierte el JSON en una lista de pacientes.
    //         ObjectMapper mapper = new ObjectMapper();

    //         Patient[] patientArray =
    //                 mapper.readValue(inputStream, Patient[].class);

    //         patients = new ArrayList<>(List.of(patientArray));

    //         // Actualiza el contador para evitar repetir identificadores.
    //         for (Patient patient : patients) {
    //             if (patient.getId() != null
    //                     && patient.getId() >= nextId.get()) {
    //                 nextId.set(patient.getId() + 1);
    //             }
    //         }

    //         // Cierra el archivo.
    //         inputStream.close();

    //     } catch (Exception e) {
    //         // Muestra el error si no se pueden cargar los pacientes.
    //         System.out.println("Error al cargar los pacientes: "
    //                 + e.getMessage());
    //     }
    // }

    // // Busca un paciente por su identificador.
    // @Override
    // public Patient getById(Long id) {
    //     for (Patient patient : patients) {
    //         if (patient.getId().equals(id)) {
    //             return patient;
    //         }
    //     }

    //     return null;
    // }

    // // Devuelve todos los pacientes.
    // @Override
    // public List<Patient> getAll() {
    //     return patients;
    // }

    // // Añade un paciente nuevo o actualiza uno existente.
    // @Override
    // public Patient add(Patient patient) {

    //     // Si no tiene identificador, se le asigna uno.
    //     if (patient.getId() == null) {
    //         patient.setId(nextId.getAndIncrement());
    //         patients.add(patient);
    //         return patient;
    //     }

    //     // Si el paciente ya existe, se actualiza.
    //     for (int i = 0; i < patients.size(); i++) {
    //         if (patients.get(i).getId().equals(patient.getId())) {
    //             patients.set(i, patient);
    //             return patient;
    //         }
    //     }

    //     // Si tiene identificador, pero no existe, se añade.
    //     patients.add(patient);
    //     return patient;
    //}

}
