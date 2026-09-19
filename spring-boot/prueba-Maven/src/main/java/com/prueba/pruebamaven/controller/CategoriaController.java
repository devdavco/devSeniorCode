package com.prueba.pruebamaven.controller;

import com.prueba.pruebamaven.dto.CategoriaDTO;
import com.prueba.pruebamaven.model.Categoria;
import com.prueba.pruebamaven.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    private final CategoriaService categoriaService;
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }
    @GetMapping
    public List<CategoriaDTO> obtenerCategorias() {
        return categoriaService.listarCategorias()
                .stream()
                .map(CategoriaDTO::new)
                .toList();
    }

    @PostMapping
    public Categoria crearCategoria(@RequestBody Categoria categoria) {
        return categoriaService.agregarCategoria(categoria);
    }
}
