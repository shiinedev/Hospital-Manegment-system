package com.Hospitalsystem.Controllers;


import com.Hospitalsystem.Models.Patient;
import com.Hospitalsystem.Services.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/patients")
public class PatientController {
    private  final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }


    @GetMapping
    public String getAllPatients(Model model) {
        model.addAttribute("patients", patientService.getAllPatients());
        return "patients";
    }

    @GetMapping("/{id}")
    public String getPatientById(@PathVariable Long id, Model model) {
        model.addAttribute("patient", patientService.getPatientById(id));
        return "patient";
    }

    @GetMapping("/new")
    public String createPatientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "create_patient";
    }

    @PostMapping
    public String savePatient(@ModelAttribute Patient patient) {
        patientService.savePatient(patient);
        return "redirect:/patients";
    }
    @RequestMapping("/{id}/edit")
    public String savePatient(@PathVariable Long id,  Model model) {
        Patient p=patientService.getPatientById(id);
        model.addAttribute("patient",p);
        return "Edit_Patient";
    }

    @RequestMapping("/{id}/delete")
    public String deletePatients(@PathVariable Long id){
       patientService.deletePatient(id);
        return "redirect:/patients";
    }

}
