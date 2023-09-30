package com.example.demoFisiApuestas.adapter.out.persistence;

import com.example.demoFisiApuestas.domain.Evento;

public class EventoMapper {

    public static Evento entityToDomain(EventoEntity eventoEntity){
        Evento evento = new Evento();
        evento.setId(eventoEntity.getId());
        evento.setEstado(1);
        return evento;
    }

    public static EventoEntity domainToEntity(Evento evento){
        EventoEntity eventoEntity = new EventoEntity();
        eventoEntity.setId(evento.getId());
        eventoEntity.setEstado_evento(evento.getEstado());
        return eventoEntity;
    }
}
