package com.unpaz.reservas.service;

import com.unpaz.reservas.dtos.request.HoraReqDto;
import com.unpaz.reservas.generic.CrudGeneric;
import com.unpaz.reservas.model.Hora;

public interface HoraService extends CrudGeneric<Hora,Long> {
    Hora saveHora(HoraReqDto hora);
}
