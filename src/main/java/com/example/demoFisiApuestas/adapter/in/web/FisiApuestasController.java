package com.example.demoFisiApuestas.adapter.in.web;

import com.example.demoFisiApuestas.application.port.in.ActualizarEventoCommand;
import com.example.demoFisiApuestas.application.port.in.ActualizarEventoPort;
import com.example.demoFisiApuestas.common.WebAdapter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
public class FisiApuestasController {
    private final ActualizarEventoPort actualizarEventoPort;

    public FisiApuestasController(ActualizarEventoPort actualizarEventoPort){
        this.actualizarEventoPort = actualizarEventoPort;
    }

    @PostMapping(path = "evento/estado/{eventoId}/{nuevoEstado}")
    void actualizaEvento(
            @PathVariable("eventoId") Long eventoId,
            @PathVariable("nuevoEstado") int nuevoEstado ){

        ActualizarEventoCommand command = new ActualizarEventoCommand(
                eventoId,
                nuevoEstado
        );
        actualizarEventoPort.actualizarEvento(command);
    }

}
