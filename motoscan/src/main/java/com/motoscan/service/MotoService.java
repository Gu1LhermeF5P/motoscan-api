package com.motoscan.service;

import com.motoscan.dto.MotoDTO;
import com.motoscan.model.Moto;
import com.motoscan.model.Patio;
import com.motoscan.repository.MotoRepository;
import com.motoscan.repository.PatioRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MotoService {

    private final MotoRepository motoRepository;
    private final PatioRepository patioRepository;

    public Moto save(MotoDTO dto) {
        Moto moto = new Moto();
        moto.setModelo(dto.getModelo());
        moto.setPlaca(dto.getPlaca());
        moto.setStatus(dto.getStatus());

        if (dto.getPatioId() != null) {
            Patio patio = patioRepository.findById(dto.getPatioId())
                    .orElseThrow(() -> new EntityNotFoundException("Pátio não encontrado"));
            moto.setPatio(patio);
        }

        return motoRepository.save(moto);
    }

    @Cacheable("motos")
    public Page<Moto> listAll(String status, Pageable pageable) {
        if (status != null && !status.isEmpty()) {
            return motoRepository.findByStatusContainingIgnoreCase(status, pageable);
        }
        return motoRepository.findAll(pageable);
    }

    public Optional<Moto> findById(Long id) {
        return motoRepository.findById(id);
    }

    public void delete(Long id) {
        motoRepository.deleteById(id);
    }
}
