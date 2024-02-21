package com.example.Videojuegos.controller;

import com.example.Videojuegos.Model.Entities.Videojuego;
import com.example.Videojuegos.Repositories.VideojuegoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class VideojuegoController {

    private final VideojuegoRepository videojuegoRepository;

    public VideojuegoController(VideojuegoRepository videojuegoRepository){
        this.videojuegoRepository=videojuegoRepository;
    }

    @GetMapping("/videojuego")
    public String home(Model model){
        Iterable<Videojuego> videojuegos = videojuegoRepository.findAll();
        model.addAttribute("videojuegos",videojuegos);
        return "LlistatVideojuegos";
    }

    @GetMapping("/videojuego/{id}")
    public String videojuegoDetalles(@PathVariable int id,Model model){
        Videojuego videojuego=videojuegoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Videojuego no encontrado con el id: "+id));
        model.addAttribute("videojuego",videojuego);
        return "VideojuegoDetalles";
    }


}
