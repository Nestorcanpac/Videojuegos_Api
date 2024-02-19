package com.example.Videojuegos.Repositories;

import com.example.Videojuegos.Model.Entities.Videojuego;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VideojuegoRepository extends CrudRepository<Videojuego,Integer> {
    Optional<Videojuego> findByNombre (String nombre);
}
