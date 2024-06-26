package com.unpaz.reservas.controller;

import com.unpaz.reservas.dtos.UsuarioRegistroDto;
import com.unpaz.reservas.exeptions.BadRequestException;
import com.unpaz.reservas.exeptions.NotFoundException;
import com.unpaz.reservas.generic.GenericResponseController;
import com.unpaz.reservas.model.Usuario;
import com.unpaz.reservas.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RequestMapping("/usu")
@RestController
public class UsuarioController implements GenericResponseController {

    @Autowired
    private UsuarioService usu;
    /*private final UsuarioService usu;
    //public UsuarioController(UsuarioService usu) {
        this.usu = usu;
    }*/

    @GetMapping("/holi")
    public String prueba(){  return "Esto es una prueba chaaoooo";
    }

    @GetMapping("/get/{id}")
    public Usuario getUsu(@PathVariable Long id){
        return usu.getUsusario(id);
    }

    @GetMapping("/getall")
    public List<Usuario> getAllUsu(){
        return usu.getAllUsusario();
    }

    @PostMapping("/registrar")
    public ResponseEntity<?> saveUsu(@Valid @RequestBody UsuarioRegistroDto usuarioRegistroDto)throws NotFoundException, BadRequestException {
        clearResponse();
        usu.saveUsu(usuarioRegistroDto);
        response.put("Usuario creado con exito : ",usuarioRegistroDto);
        return getResponse(HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public String deleteUsuario(@PathVariable Long id){
        usu.deleteUsu(id);
        return "Se Elimino el usuario con exito";
    }

    @PutMapping("/editar/{id_original}")
    public Usuario editUsu(@RequestParam Long idOriginal,
                           @RequestParam(required = false, name = "Usernasme") String newUsername )throws NotFoundException, BadRequestException {
        usu.editUsu(idOriginal,newUsername);
        return usu.getUsusario(idOriginal);
    }

}
