package com.unpaz.reservas.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UsuarioRegistroDto {
    @NotBlank(message = "El nombre es obligatorio")
    private String  nombre;
    @NotBlank(message = "El apellido es obligatorio")
    private String  apellido;
    @NotBlank(message = "El userName es obligatorio")
    private String  userName;
    @NotBlank(message = "El Email es obligatorio")
    @Email
    private String  mail;
    @Size(min = 10, max = 15, message = "El número de teléfono debe tener entre 10 y 15 caracteres")
    @NotBlank(message = "El numeroTelefono es obligatorio")
    private String  numeroTelefono;
    @NotBlank(message = "El nombre es obligatorio")
    private String  password;


}