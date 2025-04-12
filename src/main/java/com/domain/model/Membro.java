package com.gamify.domain.model;

import jakarta.persistence.*;

@Entity
public class Membro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    @ManyToOne
    private Equipe equipe;

    private boolean lider = false;

    public Membro() {}

    public Membro(String nome, String email, Equipe equipe, boolean lider) {
        this.nome = nome;
        this.email = email;
        this.equipe = equipe;
        this.lider = lider;
    }

    // Getters e setters omitidos por brevidade
}
