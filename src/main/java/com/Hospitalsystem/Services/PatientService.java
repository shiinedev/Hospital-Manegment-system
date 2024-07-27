package com.Hospitalsystem.Services;

import com.Hospitalsystem.Models.Patient;
import com.Hospitalsystem.Repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    public void savePatient(Patient patient) {
       patientRepository.save(patient);
    }


    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }


}
