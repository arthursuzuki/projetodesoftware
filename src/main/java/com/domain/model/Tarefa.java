package com.gamify.domain.model;

import jakarta.persistence.*;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    private boolean concluida = false;

    @ManyToOne
    private Etapa etapa;

    @ManyToOne
    private Membro responsavel;

    public Tarefa() {}

    public Tarefa(String titulo, String descricao, Etapa etapa, Membro responsavel) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.etapa = etapa;
        this.responsavel = responsavel;
    }

    // Getters e setters omitidos por brevidade
}
