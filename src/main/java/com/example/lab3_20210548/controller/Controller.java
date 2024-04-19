package com.example.lab3_20210548.controller;

import com.example.lab3_20210548.entity.Oftalmologo;
import com.example.lab3_20210548.entity.Paciente;
import com.example.lab3_20210548.repository.ClinicaRepository;
import com.example.lab3_20210548.repository.OftalmologoRepository;
import com.example.lab3_20210548.repository.PacienteRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Controller
public class Controller {
    final ClinicaRepository clinicaRepository;
    final OftalmologoRepository oftalmologoRepository;
    final PacienteRepository pacienteRepository;

    public Controller(ClinicaRepository clinicaRepository, OftalmologoRepository oftalmologoRepository, PacienteRepository pacienteRepository) {
        this.clinicaRepository = clinicaRepository;
        this.oftalmologoRepository = oftalmologoRepository;
        this.pacienteRepository = pacienteRepository;

    }

    @GetMapping("/listarClinicas")
    public String listar(Model model) {

        model.addAttribute("listaClinicas", clinicaRepository.findAll());
        return "listaClinicas";
    }
    @GetMapping("/listaOftalmologosXClinica")
    public String listarOftalmologosXClinica(@RequestParam("clinica_id") int clinica_id, Model model) {
        List<Oftalmologo> listarOftClinic = oftalmologoRepository.findByClinica_id(clinica_id);
        model.addAttribute("listarOftClinic", listarOftClinic);

        return "listaOftalmologos";
    }
    @GetMapping("/listaPacientesXClinica")
    public String listarPacientesXClinica(@RequestParam("clinica_id") int clinica_id, Model model) {
        List<Paciente> listarPacientesXClinica = pacienteRepository.findByClinica_Id(clinica_id);
        model.addAttribute("listarPacientesXClinica", listarPacientesXClinica);

        return "listaPacientes";
    }

    @GetMapping("/editarPaciente")
    public String editarPaciente(@RequestParam("id_paciente") int id_paciente, Model model) {

        Optional<Paciente> pacienteOptional = pacienteRepository.findById(id_paciente);
        if (pacienteOptional.isPresent()) {
            Paciente paciente = pacienteOptional.get();
            model.addAttribute("paciente", paciente);
            return "editarPaciente";
        } else {
            return "listaPacientes";
        }
    }


}
