package com.example.demoFisiApuestas;

import com.example.demoFisiApuestas.adapter.out.persistence.EventoEntity;
import com.example.demoFisiApuestas.adapter.out.persistence.SpringEventoRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Extra implements InitializingBean {
    private final SpringEventoRepository extra;

    public Extra (SpringEventoRepository extra){
        this.extra = extra;
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        this.extra.save(new EventoEntity(1L, "EquipoA vs EquipoB", 1));
    }
}
