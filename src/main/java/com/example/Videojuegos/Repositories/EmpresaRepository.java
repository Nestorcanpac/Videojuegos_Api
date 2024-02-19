package com.example.Videojuegos.Repositories;

import com.example.Videojuegos.Model.Entities.Empresa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa,Integer> {
    Optional<Empresa> findByNombre (String nombre);

}
