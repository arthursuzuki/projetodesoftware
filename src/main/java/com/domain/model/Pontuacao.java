package com.gamify.domain.model;

import jakarta.persistence.*;

@Entity
public class Pontuacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int pontos;

    @ManyToOne
    private Membro membro;

    @ManyToOne
    private Projeto projeto;

    public Pontuacao() {}

    public Pontuacao(Membro membro, Projeto projeto, int pontos) {
        this.membro = membro;
        this.projeto = projeto;
        this.pontos = pontos;
    }

    // Getters e setters omitidos por brevidade
}
