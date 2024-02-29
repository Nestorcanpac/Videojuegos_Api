package com.example.Videojuegos.Model.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_empresa;

    @Column(nullable = false)
    private int numempleados;
    private String lugarCentral;
    private String nombre;



    public Empresa(int id_empresa, int numempleados, String lugarCentral, String nombre) {
        this.id_empresa = id_empresa;
        this.numempleados = numempleados;
        this.lugarCentral = lugarCentral;
        this.nombre = nombre;

    }

    public Empresa() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public int getNumempleados() {
        return numempleados;
    }

    public void setNumempleados(int numempleados) {
        this.numempleados = numempleados;
    }

    public String getLugarCentral() {
        return lugarCentral;
    }

    public void setLugarCentral(String lugarCentral) {
        this.lugarCentral = lugarCentral;
    }


}
