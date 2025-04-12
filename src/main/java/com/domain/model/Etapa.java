package com.gamify.domain.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Etapa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private int ordem;

    @ManyToOne
    private Projeto projeto;

    @OneToMany(mappedBy = "etapa", cascade = CascadeType.ALL)
    private List<Tarefa> tarefas;

    public Etapa() {}

    public Etapa(String nome, int ordem, Projeto projeto) {
        this.nome = nome;
        this.ordem = ordem;
        this.projeto = projeto;
    }

    // Getters e setters omitidos por brevidade
}
