package com.example.Videojuegos.Repositories;

import com.example.Videojuegos.Model.Entities.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Integer> {

    Optional<Cliente> findByNombre (String nombre);
}
