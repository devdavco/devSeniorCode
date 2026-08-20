package com.prueba.pruebamaven.repository;

import com.prueba.pruebamaven.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Categoria, Long> {

}
