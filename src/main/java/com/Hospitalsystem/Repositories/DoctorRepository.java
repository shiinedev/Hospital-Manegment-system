package com.Hospitalsystem.Repositories;

import com.Hospitalsystem.Models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}
