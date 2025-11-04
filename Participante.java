package com.exemplo.controleeventos.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;
}
