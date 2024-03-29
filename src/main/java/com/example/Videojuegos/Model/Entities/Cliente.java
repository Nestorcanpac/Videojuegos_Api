package com.example.Videojuegos.Model.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_cliente;

    @Column(nullable = false)
    private int edad;
    private String sexo;
    private String nombre;





    public Cliente() {
    }

    public Cliente(int id_cliente, int edad, String sexo, String nombre) {
        this.id_cliente = id_cliente;
        this.edad = edad;
        this.sexo = sexo;
        this.nombre = nombre;

    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
