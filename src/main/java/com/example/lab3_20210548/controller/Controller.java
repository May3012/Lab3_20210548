package com.example.lab3_20210548.controller;

import com.example.lab3_20210548.repository.ClinicaRepository;
import com.example.lab3_20210548.repository.OftalmologoRepository;
import com.example.lab3_20210548.repository.PacienteRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    final ClinicaRepository clinicaRepository;


    public Controller(ClinicaRepository clinicaRepository) {
        this.clinicaRepository = clinicaRepository;

    }

    @GetMapping("/listarClinicas")
    public String listar(Model model) {

        model.addAttribute("listaClinicas", clinicaRepository.findAll());
        return "listaClinicas";
    }



}
