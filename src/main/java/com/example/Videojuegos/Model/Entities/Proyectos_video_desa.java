package com.example.Videojuegos.Model.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "proyectos_video_desa")
public class Proyectos_video_desa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_proyecto;

    @Column(nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_videojuego")
    private Videojuego videojuego;

    @ManyToOne
    @JoinColumn(name = "id_desarrollador")
    private Desarrollador desarrollador;

    public Proyectos_video_desa() {
    }

    public Proyectos_video_desa(int id_proyecto, String nombre, Videojuego videojuego, Desarrollador desarrollador) {
        this.id_proyecto = id_proyecto;
        this.nombre = nombre;
        this.videojuego = videojuego;
        this.desarrollador = desarrollador;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public Videojuego getVideojuego() {
        return videojuego;
    }

    public void setVideojuego(Videojuego videojuego) {
        this.videojuego = videojuego;
    }

    public Desarrollador getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(Desarrollador desarrollador) {
        this.desarrollador = desarrollador;
    }
}
