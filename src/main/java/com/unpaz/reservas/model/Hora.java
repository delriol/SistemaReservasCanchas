package com.unpaz.reservas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



@Data
@Entity
@Table(name = "HORAS")
public class Hora {
    @Column(name="ID_HORA")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHora;
    @Column(name="DESCRIPCION")
    private String descripcion;
    @Column(name="DISPONIBLE")
    private Boolean disponible = false;

    public Hora() {
        this.disponible = false;  // Valor por defecto
    }
}
