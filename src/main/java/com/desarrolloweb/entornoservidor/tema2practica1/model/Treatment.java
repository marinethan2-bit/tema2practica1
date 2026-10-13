package com.desarrolloweb.entornoservidor.tema2practica1.model;

public class Treatment {
    private Long id;
    private Long medicalRecordId;
    private String description;
    private String medication;

    public Treatment() {
    }

    public Treatment(Long id, Long medicalRecordId, String description, String medication) {
        this.id = id;
        this.medicalRecordId = medicalRecordId;
        this.description = description;
        this.medication = medication;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(Long medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    @Override
    public Treatment clone() {
        try {
            return (Treatment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    
    
}
