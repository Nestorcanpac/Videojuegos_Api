package com.example.Videojuegos.controller;

import com.example.Videojuegos.Model.Entities.Empresa;
import com.example.Videojuegos.Repositories.EmpresaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EmpresaController {
    private final EmpresaRepository empresaRepository;

    public EmpresaController(EmpresaRepository empresaRepository){
        this.empresaRepository=empresaRepository;
    }

    @GetMapping("/empresa")
    public String home(Model model){
        Iterable<Empresa> empresas = empresaRepository.findAll();
        model.addAttribute("empresas",empresas);
        return "LlistatEmpresas";
    }

    @GetMapping("/empresa/{id}")
    public String empresaDetalls(@PathVariable int id,Model model){
        Empresa empresa = empresaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Videojuego no encontrado con el id: "+id));
        model.addAttribute("empresa",empresa);
        return "EmmpresaDetalles";
    }

}
