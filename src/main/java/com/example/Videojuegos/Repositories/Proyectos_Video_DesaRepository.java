package com.example.Videojuegos.Repositories;

import com.example.Videojuegos.Model.Entities.Proyectos_video_desa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Proyectos_Video_DesaRepository extends CrudRepository<Proyectos_video_desa,Integer> {
    Optional<Proyectos_video_desa> findByNombre (String Nombre);
}
