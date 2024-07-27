package com.Hospitalsystem.Services;

import com.Hospitalsystem.Models.Appointment;
import com.Hospitalsystem.Repositories.AppointmentRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    private  final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public Appointment getAppointmentById(Long id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    public void saveAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }


    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }

}
