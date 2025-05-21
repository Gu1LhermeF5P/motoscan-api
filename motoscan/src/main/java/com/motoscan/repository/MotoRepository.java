package com.motoscan.repository;

import com.motoscan.model.Moto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoRepository extends JpaRepository<Moto, Long> {
    Page<Moto> findByStatusContainingIgnoreCase(String status, Pageable pageable);
}
