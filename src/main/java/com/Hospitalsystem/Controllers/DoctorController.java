package com.Hospitalsystem.Controllers;


import com.Hospitalsystem.Models.Doctor;
import com.Hospitalsystem.Models.Patient;
import com.Hospitalsystem.Services.DoctorService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    public String getAllDoctors(Model model) {
        model.addAttribute("doctors", doctorService.getAllDoctors());
        return "doctors";
    }

    @RequestMapping("/{id}")
    public String getDoctorById(@PathVariable Long id, Model model) {
        model.addAttribute("doctor", doctorService.getDoctorById(id));
        return "doctor";
    }

    @GetMapping("/new")
    public String createDoctorForm(Model model) {
        model.addAttribute("doctor", new Doctor());
        return "create_doctor";
    }

    @PostMapping
    public String saveDoctor(@ModelAttribute Doctor doctor) {
        doctorService.saveDoctor(doctor);
        return "redirect:/doctors";
    }
    @RequestMapping("/{id}/edit")
    public String UpdateDoctor(@PathVariable Long id,  Model model) {
        Doctor doctor = doctorService.getDoctorById(id);
        model.addAttribute("doctor", doctor);
        return "Edit_Doctor";
    }
//    @RequestMapping("/{id}/edit")
//    public String savePatient(@PathVariable Long id,  Model model) {
//        Patient p=patientService.getPatientById(id);
//        model.addAttribute("patient",p);
//        return "Edit_Patient";
//    }

    @RequestMapping("/{id}/delete")
    public String deleteDoctors(@PathVariable Long id) {
        doctorService.deleteDoctor(id);
        return "redirect:/doctors";
    }

////    @DeleteMapping("/{id}/delete")
////    public String deleteDoctor(@PathVariable Long id) {
////        doctorService.deleteDoctor(id);
////        return "redirect:/doctors";
//    }


}