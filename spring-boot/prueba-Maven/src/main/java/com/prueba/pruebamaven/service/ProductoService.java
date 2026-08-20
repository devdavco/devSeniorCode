package com.prueba.pruebamaven.service;

import com.prueba.pruebamaven.model.Categoria;
import com.prueba.pruebamaven.model.Marca;
import com.prueba.pruebamaven.model.Producto;
import com.prueba.pruebamaven.repository.CategoriaRepository;
import com.prueba.pruebamaven.repository.MarcaRepository;
import com.prueba.pruebamaven.repository.ProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;
    private final CategoriaRepository categoriaRepository;
    private final MarcaRepository marcaRepository;

    public ProductoService(ProductoRepository productoRepository,
                           CategoriaRepository categoriaRepository,
                           MarcaRepository marcaRepository) {
        this.productoRepository = productoRepository;
        this.categoriaRepository = categoriaRepository;
        this.marcaRepository = marcaRepository;
    }

    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    public List<Producto> listarPorCategoria(Long categoriaId) {
        return productoRepository.findByCategoriaId(categoriaId);
    }

    public Producto agregarProducto(Producto producto) {
        resolverCategoria(producto);
        resolverMarca(producto);
        return productoRepository.save(producto);
    }

    @Transactional
    public void eliminarProducto (Long id) {
        Producto producto = productoRepository.findById(id)
                        .orElseThrow(()-> new RuntimeException("Producto no encontrado"));
        productoRepository.delete(producto);
    }
    @Transactional
    public void eliminarTodos(){
        productoRepository.deleteAllInBatch();
    }

    private void resolverCategoria(Producto producto) {
        if (producto.getCategoria() != null
                && producto.getCategoria().getId() != null) {
            Categoria categoria = categoriaRepository
                    .findById(producto.getCategoria().getId())
                    .orElse(null);
            producto.setCategoria(categoria);
        }
    }

    private void resolverMarca(Producto producto) {
        if (producto.getMarca() != null
                && producto.getMarca().getId() != null) {
            Marca marca = marcaRepository
                    .findById(producto.getMarca().getId())
                    .orElse(null);
            producto.setMarca(marca);
        }
    }


}