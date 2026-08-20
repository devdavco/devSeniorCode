package com.prueba.pruebamaven.service;


import com.prueba.pruebamaven.model.Marca;
import com.prueba.pruebamaven.repository.MarcaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MarcaService {
    private final MarcaRepository marcaRepository;
    public MarcaService(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }
    public List<Marca> listarMarcas(){
        return marcaRepository.findAll();
    }
    public Marca agregarMarca(Marca marca){
        return marcaRepository.save(marca);
    }
}
