package com.example.demoFisiApuestas.application.port.out;

import com.example.demoFisiApuestas.domain.Evento;
import org.springframework.stereotype.Repository;


public interface LoadEventoPort {
    Evento load(Long id);
}
