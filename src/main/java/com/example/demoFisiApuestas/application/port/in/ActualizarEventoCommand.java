package com.example.demoFisiApuestas.application.port.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActualizarEventoCommand {

    private Long eventoId;

    private int nuevoEstado;

}
