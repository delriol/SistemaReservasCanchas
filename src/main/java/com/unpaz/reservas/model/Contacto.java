package com.unpaz.reservas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Table(name="CONTACTOS")
@Entity
@Data
public class Contacto {
    @Column(name="ID_CONTACTO")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContacto;
    @NotBlank(message = "El nombre es obligatorio")
    @Column(name="NOMBRE")
    private String nombre;
    @NotBlank(message = "El apellido es obligatorio")
    @Column(name="APELLIDO")
    private String apellido;
    @Email(message = "El correo electrónico debe ser válido")
    @NotBlank(message = "El correo electrónico es obligatorio")
    @Column(name="MAIL")
    private String mail;
    @NotBlank(message = "El número de teléfono es obligatorio")
    @Size(min = 10, max = 15, message = "El número de teléfono debe tener entre 10 y 15 caracteres")
    @Column(name="NTELEFONO")
    private String ntelefono;
}
