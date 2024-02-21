package com.example.Videojuegos.controller;

import com.example.Videojuegos.Model.Entities.Desarrollador;
import com.example.Videojuegos.Repositories.DesarrolladorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DesarrolladorController {
    private final DesarrolladorRepository desarrolladorRepository;

    public DesarrolladorController(DesarrolladorRepository desarrolladorRepository){
        this.desarrolladorRepository=desarrolladorRepository;
    }

    @GetMapping("/desarrollador")
    public String home(Model model){
        Iterable<Desarrollador> desarrolladors= desarrolladorRepository.findAll();
        model.addAttribute("desarrolladores",desarrolladors);
        return "ListaDesarrolladores";
    }

    @GetMapping("/desarrollador/{id}")
    public String desarrolladorDetalle(@PathVariable int id,Model model){
        Desarrollador desarrollador= desarrolladorRepository.findById(id)
                .orElseThrow(() ->new IllegalArgumentException("Desarrollador no encontrado con el id: "+id));
        model.addAttribute("desarrollador",desarrollador);
        return "DesarrolladorDetalle";
    }

}
