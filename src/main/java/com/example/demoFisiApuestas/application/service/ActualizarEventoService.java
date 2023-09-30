package com.example.demoFisiApuestas.application.service;

import com.example.demoFisiApuestas.application.port.in.ActualizarEventoCommand;
import com.example.demoFisiApuestas.application.port.in.ActualizarEventoPort;
import com.example.demoFisiApuestas.application.port.out.LoadEventoPort;
import com.example.demoFisiApuestas.application.port.out.UpdateEventoPort;
import com.example.demoFisiApuestas.common.UseCase;
import com.example.demoFisiApuestas.domain.Evento;


import javax.transaction.Transactional;

//import javax.transaction.Transactional;

@UseCase
public class ActualizarEventoService implements ActualizarEventoPort {
    private final LoadEventoPort loadEventoPort;
    private final UpdateEventoPort updateEventoPort;

    public ActualizarEventoService(LoadEventoPort loadEventoPort, UpdateEventoPort updateEventoPort){
        this.loadEventoPort = loadEventoPort;
        this.updateEventoPort = updateEventoPort;
    }

    @Transactional
    @Override
    public boolean actualizarEvento(ActualizarEventoCommand command) {

        Evento evento = loadEventoPort.load(command.getEventoId());

        evento.cambiarEstadoEvento(command.getNuevoEstado());

        updateEventoPort.update(evento);

        return true;
    }
}
