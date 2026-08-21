package com.prueba.pruebamaven.controller;

import com.prueba.pruebamaven.model.Marca;
import com.prueba.pruebamaven.service.MarcaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marcas")
public class MarcaController {
    private MarcaService marcaService;
    public MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }
    @GetMapping
    public List<Marca> obtenerMarcas(){
        return marcaService.listarMarcas();
    }
    @PostMapping
    public Marca crearMarca(@RequestBody Marca marca) {
        return marcaService.agregarMarca(marca);
    }
}
