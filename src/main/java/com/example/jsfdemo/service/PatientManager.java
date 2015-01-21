package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Patient;

@ApplicationScoped
public class PatientManager {

    private List<Patient> db = new ArrayList<Patient>();

    public void addPatient(Patient patient) {
        Patient newPatient = new Patient();

        newPatient.setFirstName(patient.getFirstName());
        newPatient.setSecoundName(patient.getSecoundName());
        newPatient.setPhoneNumber(patient.getPhoneNumber());
        newPatient.setPesel(patient.getPesel());
        newPatient.setCountry(patient.getCountry());
        newPatient.setCity(patient.getCity());
        newPatient.setStreet(patient.getStreet());
        newPatient.setStreetNumber(patient.getStreetNumber());
        newPatient.setHouseNumber(patient.getHouseNumber());
        newPatient.setZipCode(patient.getZipCode());
        newPatient.setDateOfBirth(patient.getDateOfBirth());
        newPatient.setWeight(patient.getWeight());

        db.add(newPatient);
    }

    // Removes the Patient with given PIN
    public void deletePatient(Patient Patient) {
        Patient PatientToRemove = null;
        for (Patient p : db) {
            if (Patient.getPesel().equals(p.getPesel())) {
                PatientToRemove = p;
                break;
            }
        }
        if (PatientToRemove != null)
            db.remove(PatientToRemove);
    }

    public List<Patient> getAllPatients() {
        return db;
    }
}
