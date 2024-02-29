package com.example.Videojuegos.RestControllers;
import com.example.Videojuegos.Model.Entities.Cliente;
import com.example.Videojuegos.Model.Entities.Desarrollador;
import com.example.Videojuegos.Model.Entities.Empresa;
import com.example.Videojuegos.Model.Entities.Videojuego;
import com.example.Videojuegos.Repositories.ClienteRepository;
import com.example.Videojuegos.Repositories.DesarrolladorRepository;
import com.example.Videojuegos.Repositories.EmpresaRepository;
import com.example.Videojuegos.Repositories.VideojuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RestControllers {
    @Autowired
    VideojuegoRepository videojuegoRepository;

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    EmpresaRepository empresaRepository;

    @Autowired
    DesarrolladorRepository desarrolladorRepository;
    @GetMapping("/videojuegoRes")
    public List<Videojuego> obtenerVideojuegos() {
        return (List<Videojuego>) videojuegoRepository.findAll();
    }

    @GetMapping("/clienteRes")
    public List<Cliente> obtenerCliente() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @GetMapping("/desarrolladorRes")
    public List<Desarrollador> obtenerDesarrollador() {
        return (List<Desarrollador>) desarrolladorRepository.findAll();
    }

    @GetMapping("/empresaRes")
    public List<Empresa> obtenerEmpresa() {
        return (List<Empresa>) empresaRepository.findAll();
    }

}
