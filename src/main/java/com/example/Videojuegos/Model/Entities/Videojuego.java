package com.example.Videojuegos.Model.Entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "videojuego")
public class Videojuego {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_videojuego;

    @Column(nullable = false)
    private String nombre;
    private int precio;
    private String foto_caratula;


    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;

    @OneToMany(mappedBy = "videojuego",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Cliente> clienteList;

    @OneToMany(mappedBy = "videojuego")
    private Set<Proyectos_video_desa> proyectos_video_desaSet;

    public Videojuego() {
    }

    public Videojuego(int id_videojuego, String nombre, int precio, String foto_caratula, Empresa empresa, List<Cliente> clienteList, Set<Proyectos_video_desa> proyectos_video_desaSet) {
        this.id_videojuego = id_videojuego;
        this.nombre = nombre;
        this.precio = precio;
        this.foto_caratula = foto_caratula;
        this.empresa = empresa;
        this.clienteList = clienteList;
        this.proyectos_video_desaSet = proyectos_video_desaSet;
    }

    public int getId_videojuego() {
        return id_videojuego;
    }

    public void setId_videojuego(int id_videojuego) {
        this.id_videojuego = id_videojuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFoto_caratula() {
        return foto_caratula;
    }

    public void setFoto_caratula(String foto_caratula) {
        this.foto_caratula = foto_caratula;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public Set<Proyectos_video_desa> getProyectos_video_desaSet() {
        return proyectos_video_desaSet;
    }



    public void setProyectos_video_desaSet(Set<Proyectos_video_desa> proyectos_video_desaSet) {
        this.proyectos_video_desaSet = proyectos_video_desaSet;
    }

}


