package com.example.Videojuegos.controller;

import com.example.Videojuegos.Model.Entities.Cliente;
import com.example.Videojuegos.Repositories.ClienteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ClienteController {
    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping("/cliente")
    public String home(Model model){
        Iterable<Cliente> clientes= clienteRepository.findAll();
        model.addAttribute("clientes",clientes);
        return "ListaClientes";
    }

    @GetMapping("/cliente/{id}")
    public String clientesDetalles(@PathVariable int id,Model model){
        Cliente cliente= clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente no encontrado con el id: "+id));
        model.addAttribute("cliente",cliente);
        return "ClienteDetalle";
    }
}
