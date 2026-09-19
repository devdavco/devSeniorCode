package com.prueba.pruebamaven.dto;

import com.prueba.pruebamaven.model.Categoria;
import com.prueba.pruebamaven.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class CategoriaDTO {

    private long id;
    private String nombre;
    private List<String> productos = new ArrayList<>();


    public CategoriaDTO(Categoria categoria) {
        this.id = categoria.getId();
        this.nombre = categoria.getNombre();
        this.productos = categoria.getProductos() != null
                ? categoria.getProductos().stream().map(Producto::getNombre).toList()
        : new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }
}
