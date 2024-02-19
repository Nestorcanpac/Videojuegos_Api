package com.example.Videojuegos.Repositories;

import com.example.Videojuegos.Model.Entities.Desarrollador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DesarrolladorRepository extends CrudRepository<Desarrollador,Integer> {
    Optional<Desarrollador> findByNombre (String nombre);
}
