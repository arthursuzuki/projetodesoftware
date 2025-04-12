package com.gamify.domain.model;

import jakarta.persistence.*;

@Entity
public class Desafio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    private int pontos;

    private boolean ativo = true;

    @ManyToOne
    private Projeto projeto;

    public Desafio() {}

    public Desafio(String titulo, String descricao, int pontos, Projeto projeto) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.pontos = pontos;
        this.projeto = projeto;
    }

    // Getters e setters omitidos por brevidade
}
