package com.dev.backend.repository;

 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;
import com.dev.backend.entity.Estado;;

@RestController
public interface EstadoRepository extends JpaRepository<Estado, Long> {
    
}

