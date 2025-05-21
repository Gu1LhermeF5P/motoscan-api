package com.motoscan.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MotoDTO {

    private Long id;

    @NotBlank
    @Pattern(regexp = "[A-Z]{3}\\d[A-Z0-9]\\d{2}", message = "Formato inválido de placa.")
    private String placa;

    @NotBlank
    private String modelo;

    @NotBlank
    private String status;

    private Long patioId;
}
