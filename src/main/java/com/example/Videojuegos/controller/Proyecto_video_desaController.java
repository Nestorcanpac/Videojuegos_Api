package com.example.Videojuegos.controller;

import com.example.Videojuegos.Model.Entities.Proyectos_video_desa;
import com.example.Videojuegos.Repositories.Proyectos_Video_DesaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller

public class Proyecto_video_desaController {
    private final Proyectos_Video_DesaRepository proyectosVideoDesaRepository;

    public Proyecto_video_desaController(Proyectos_Video_DesaRepository proyectosVideoDesaRepository) {
        this.proyectosVideoDesaRepository = proyectosVideoDesaRepository;
    }

    @GetMapping("/proyecto")
    public String home(Model model){
        Iterable<Proyectos_video_desa> proyectosVideoDesas = proyectosVideoDesaRepository.findAll();
        model.addAttribute("proyecto_video_desas",proyectosVideoDesas);
        return "ListaProyectos";
    }

    @GetMapping("/proyecto/{id}")
    public String proyectoDetalles(@PathVariable int id,Model model){
        Proyectos_video_desa proyectosVideoDesa= proyectosVideoDesaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Proyecto no encontrado con el id: "+id));
        model.addAttribute("proyecto",proyectosVideoDesa);
        return "ProyectoDetalles";
    }

}
