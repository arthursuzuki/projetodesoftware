package com.gamify.domain.model;

import jakarta.persistence.*;

@Entity
public class Recompensa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    private int pontosNecessarios;

    private String tipo; // Ex: "iFood", "Pix", "Folga"

    public Recompensa() {}

    public Recompensa(String titulo, String descricao, int pontosNecessarios, String tipo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.pontosNecessarios = pontosNecessarios;
        this.tipo = tipo;
    }

    // Getters e setters omitidos por brevidade
}
