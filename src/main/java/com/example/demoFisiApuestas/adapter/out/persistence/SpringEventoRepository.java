package com.example.demoFisiApuestas.adapter.out.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;


public interface SpringEventoRepository extends JpaRepository<EventoEntity, Long> {

}

