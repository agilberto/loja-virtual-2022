package com.dev.backend.repository;

 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;
import com.dev.backend.entity.Marca;;

@RestController
public interface MarcaRepository extends JpaRepository<Marca, Long> {
    
}

