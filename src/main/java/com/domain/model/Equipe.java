package com.gamify.domain.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "equipe", cascade = CascadeType.ALL)
    private List<Membro> membros;

    @OneToMany(mappedBy = "equipe", cascade = CascadeType.ALL)
    private List<Projeto> projetos;

    public Equipe() {}

    public Equipe(String nome) {
        this.nome = nome;
    }

    // Getters e setters omitidos por brevidade
}
