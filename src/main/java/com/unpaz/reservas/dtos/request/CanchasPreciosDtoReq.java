package com.unpaz.reservas.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
@Data
public class CanchasPreciosDtoReq {
    @NotBlank(message = "La descripcionCancha es obligatoria")
    private String descripcionCancha;
    @NotBlank(message = "La valorPesos es obligatoria")
    private BigDecimal valorPesos;
}
