package com.numions.catalog;

import org.springframework.http.ResponseEntity;

import java.util.List;

public class Producto {
    int id;
    String nombre;
    List<Producto> productosDelCatalogo =null;

    public Producto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
