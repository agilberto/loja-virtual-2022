package com.dev.backend.repository;

 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.dev.backend.entity.Categoria;

@RestController
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}

