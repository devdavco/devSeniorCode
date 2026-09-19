package com.prueba.pruebamaven.controller;

import com.prueba.pruebamaven.model.Producto;
import com.prueba.pruebamaven.dto.ProductoDTO;
import com.prueba.pruebamaven.service.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<ProductoDTO> obtenerProductos() {
        return productoService.listarProductos()
                .stream()
                .map(ProductoDTO::new)
                .toList();
    }

    @GetMapping("/categoria/{categoriaId}")
    public List<ProductoDTO> obtenerPorCategoria(
            @PathVariable Long categoriaId) {
        return productoService.listarPorCategoria(categoriaId)
                .stream()
                .map(ProductoDTO::new)
                .toList();
    }

    @PostMapping
    public ProductoDTO crearProducto(@RequestBody Producto producto) {
        Producto guardado = productoService.agregarProducto(producto);
        return new ProductoDTO(guardado);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> eliminarTodos() {
        productoService.eliminarTodos();
        return ResponseEntity.noContent().build();
    }
}