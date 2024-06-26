package com.unpaz.reservas.dtos.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class HoraReqDto {
    @NotBlank(message = "El campo descripcion no debe estar vacio")
    private String descripcion;
}
