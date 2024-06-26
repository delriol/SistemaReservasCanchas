package com.unpaz.reservas.service.imp;

import com.unpaz.reservas.dtos.request.HoraReqDto;
import com.unpaz.reservas.model.Hora;
import com.unpaz.reservas.repository.HoraRepository;
import com.unpaz.reservas.service.HoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HoraServiceImp implements HoraService {
    @Autowired
    private HoraRepository horaRepository;

    @Override
    public Hora save(Hora obj) {
        return null;
    }

    @Override
    public Hora update(Hora obj) {
        return null;
    }

    @Override
    public Hora getbyId(Long id) {
        return null;
    }

    @Override
    public List<Hora> getAll() {
        return horaRepository.findAll();
    }

    @Override
    public void delete(Hora obj) {

    }

    @Override
    public Hora saveHora(HoraReqDto hora) {
        Hora horaNew = new Hora();
        horaNew.setDescripcion(hora.getDescripcion());
        horaNew.setDisponible(false);
        return horaRepository.save(horaNew);
    }
}
