package com.example.demoFisiApuestas.adapter.out.persistence;

import com.example.demoFisiApuestas.application.port.out.LoadEventoPort;
import com.example.demoFisiApuestas.application.port.out.UpdateEventoPort;
import com.example.demoFisiApuestas.common.PersistenceAdapter;
import com.example.demoFisiApuestas.domain.Evento;

@PersistenceAdapter
public class EventoPersistenceAdapter implements LoadEventoPort, UpdateEventoPort {
    private final SpringEventoRepository eventoRepository;

    public EventoPersistenceAdapter(SpringEventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    @Override
    public Evento load(Long id) {
        return eventoRepository
                .findById(id)
                .map(EventoMapper::entityToDomain)
                .orElseThrow(RuntimeException::new); //mejorar Exception
    }

    @Override
    public void update(Evento evento) {
        eventoRepository.save(EventoMapper.domainToEntity(evento));
    }
}
