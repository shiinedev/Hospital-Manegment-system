package com.Hospitalsystem.Repositories;

import com.Hospitalsystem.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
