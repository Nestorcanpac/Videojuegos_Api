package com.example.Videojuegos.Model.Entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "desarrollador")
public class Desarrollador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_desarrollador;

    @Column(nullable = false)
    private String nombre;
    private String razon_social;


    @OneToMany(mappedBy = "desarrollador")
    private Set<Proyectos_video_desa> proyectos_video_desaSet;

    public Desarrollador() {
    }

    public Desarrollador(int id_desarrollador, String nombre, String razon_social, Set<Proyectos_video_desa> proyectos_video_desaSet) {
        this.id_desarrollador = id_desarrollador;
        this.nombre = nombre;
        this.razon_social = razon_social;
        this.proyectos_video_desaSet = proyectos_video_desaSet;
    }

    public int getId_desarrollador() {
        return id_desarrollador;
    }

    public void setId_desarrollador(int id_desarrollador) {
        this.id_desarrollador = id_desarrollador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public Set<Proyectos_video_desa> getProyectos_video_desaSet() {
        return proyectos_video_desaSet;
    }



    public void setProyectos_video_desaSet(Set<Proyectos_video_desa> proyectos_video_desaSet) {
        this.proyectos_video_desaSet = proyectos_video_desaSet;
    }



}
