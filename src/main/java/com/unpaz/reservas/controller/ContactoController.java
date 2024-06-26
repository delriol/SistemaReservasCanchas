package com.unpaz.reservas.controller;

import com.unpaz.reservas.exeptions.BadRequestException;
import com.unpaz.reservas.exeptions.NotFoundException;
import com.unpaz.reservas.generic.GenericResponseController;
import com.unpaz.reservas.model.Contacto;
import com.unpaz.reservas.service.ContactoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/contacto")
@RestController
public class ContactoController implements GenericResponseController {
    private final ContactoService cont;

    public ContactoController(ContactoService cont) {
        this.cont = cont;
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAllContactos(){
        clearResponse();
        response.put("Lista de Contactos", cont.getAllContacto());
        return getResponse(HttpStatus.OK);
    }

    @GetMapping("/getcontacto/{id}")
    public ResponseEntity<?> getContacto(@PathVariable Long id){
        clearResponse();
        response.put("Contacto :", cont.getContacto(id));
        return getResponse(HttpStatus.OK);
    }


    @PostMapping("/guardar")
    public ResponseEntity<?> saveContacto(@RequestBody Contacto contacto)throws NotFoundException, BadRequestException {
        clearResponse();
        response.put("Contacto Creado con exito : ", contacto);
        return getResponse(HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public String deleteContacto(@PathVariable Long id){
        cont.deleteContacto(id);
        return "Se Elimino el Contacto con exito";
    }
}
