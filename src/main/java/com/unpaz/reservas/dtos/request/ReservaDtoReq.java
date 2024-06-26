package com.unpaz.reservas.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class ReservaDtoReq {

    @NotBlank(message = "El idUsuario es obligatorio")
    private Long idUsuario;
    //@NotBlank(message = "El idCanchaPrecio es obligatorio")
    private Long idCanchaPrecio ;
    //@NotNull(message = "El idHora es obligatorio")
    private Long idHora;
    //NotBlank(message = "El fecha es obligatorio")
    //DateTimeFormat
    private Date fecha;

    /*public ReservaDto(Reserva reserva){
        this.idReserva = reserva.getIdReserva();
        this.idUsuario = reserva.getUsu().getId_usuario();
        this.idCanchaPrecio = reserva.getCanchaPrecio().getIdCanchaPrecio();
        this.fecha = reserva.getFecha();
        this.idHora = reserva.getHora().getIdHora();
    }*/
}
