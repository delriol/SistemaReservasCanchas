package com.unpaz.reservas.controller;

import com.unpaz.reservas.dtos.request.HoraReqDto;
import com.unpaz.reservas.exeptions.BadRequestException;
import com.unpaz.reservas.exeptions.NotFoundException;
import com.unpaz.reservas.generic.GenericResponseController;
import com.unpaz.reservas.model.Hora;
import com.unpaz.reservas.service.imp.HoraServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/hora")
@RestController
public class HoraController implements GenericResponseController {

    @Autowired
    private HoraServiceImp horaServiceImp;

    @GetMapping("/getall")
    public ResponseEntity<?> getAllhoras(){
        clearResponse();
        response.put("Lista de Horas para alquilar", horaServiceImp.getAll());
        return getResponse(HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity<?> saveHora(@RequestBody HoraReqDto hora)throws NotFoundException, BadRequestException {
        clearResponse();
        response.put("Hora Creada con exito : ", horaServiceImp.saveHora(hora));
        return getResponse(HttpStatus.CREATED);
    }


    /*@PostMapping("/guardar")
    public ResponseEntity<?> saveHora(@RequestBody Hora hora)throws NotFoundException, BadRequestException {
        clearResponse();
        response.put("Hora Creada con exito : ", hora.);
        return getResponse(HttpStatus.CREATED);
    }*/


}
