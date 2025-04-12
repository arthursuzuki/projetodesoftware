package com.gamify.domain.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    private Equipe equipe;

    @OneToMany(mappedBy = "projeto", cascade = CascadeType.ALL)
    private List<Etapa> etapas;

    @OneToMany(mappedBy = "projeto", cascade = CascadeType.ALL)
    private List<Desafio> desafios;

    private boolean ativo = true;

    // Getters, setters e construtores
    public Projeto() {}

    public Projeto(String nome, Equipe equipe) {
        this.nome = nome;
        this.equipe = equipe;
    }

    // Getters e setters omitidos por brevidade
}
