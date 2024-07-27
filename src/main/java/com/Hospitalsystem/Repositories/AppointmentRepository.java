package com.Hospitalsystem.Repositories;

import com.Hospitalsystem.Models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
}
