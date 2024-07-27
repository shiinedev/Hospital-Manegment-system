package com.Hospitalsystem.Controllers;

import com.Hospitalsystem.Models.Appointment;
import com.Hospitalsystem.Models.Doctor;
import com.Hospitalsystem.Services.AppointmentService;

import com.Hospitalsystem.Services.DoctorService;
import com.Hospitalsystem.Services.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/appointments")
public class AppointmentController {

    private  final AppointmentService appointmentService;
    private final PatientService patientService;
    private final DoctorService doctorService;

    public AppointmentController(AppointmentService appointmentService, PatientService patientService, DoctorService doctorService) {
        this.appointmentService = appointmentService;
        this.patientService = patientService;
        this.doctorService = doctorService;
    }

    @GetMapping
    public String getAllAppointments(Model model) {
        model.addAttribute("appointments", appointmentService.getAllAppointments());
        return "appointments";
    }

    @GetMapping("/{id}")
    public String getAppointmentById(@PathVariable Long id, Model model) {
        model.addAttribute("appointment", appointmentService.getAppointmentById(id));
        return "appointment";
    }

    @GetMapping("/new")
    public String createAppointmentForm(Model model) {
        model.addAttribute("appointment", new Appointment());
        model.addAttribute("patients", patientService.getAllPatients());
        model.addAttribute("doctors", doctorService.getAllDoctors());
        return "create_appointment";
    }

    @PostMapping
    public String saveAppointment(@ModelAttribute Appointment appointment) {
        appointmentService.saveAppointment(appointment);
        return "redirect:/appointments";
    }
    @RequestMapping("/{id}/edit")
    public String updateAppointment(@PathVariable Long id,  Model model) {
        Appointment appointment = appointmentService.getAppointmentById(id);
        model.addAttribute("appointment", appointment);
        return "redirect:/appointments";
    }
//    @RequestMapping("/{id}/edit")
//    public String UpdateDoctor(@PathVariable Long id,  Model model) {
//        Doctor doctor = doctorService.getDoctorById(id);
//        model.addAttribute("doctor", doctor);
//        return "Edit_Doctor";
//    }

    @DeleteMapping("/{id}/delete")
    public String deleteAppointment(@PathVariable Long id) {
        appointmentService.deleteAppointment(id);
        return "redirect:/appointments";
    }

}
