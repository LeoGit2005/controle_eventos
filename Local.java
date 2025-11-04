package com.exemplo.controleeventos.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;
    private Integer capacidade;

    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL)
    private List<Evento> eventos;
}
