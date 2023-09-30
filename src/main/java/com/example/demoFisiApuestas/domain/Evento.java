package com.example.demoFisiApuestas.domain;

import lombok.Data;

@Data
public class Evento {
    private Long id;

    private String deporte;

    private String team1;

    private String team2;

    private String date;

    private float montoT1;

    private float montoT2;

    private int estado;

    public void cambiarEstadoEvento(int estado){
        this.estado = estado;
    }

    public void cambiarMontos(float mt1, float mt2){
        this.montoT1 = mt1;
        this.montoT2 = mt2;
    }

}
