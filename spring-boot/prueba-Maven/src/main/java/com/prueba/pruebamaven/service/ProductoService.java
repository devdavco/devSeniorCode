package com.prueba.pruebamaven.service;

import com.prueba.pruebamaven.model.Producto;
import com.prueba.pruebamaven.repository.CategoriaRepository;
import com.prueba.pruebamaven.repository.MarcaRepository;
import com.prueba.pruebamaven.repository.ProductoRepository;
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
}

//comment