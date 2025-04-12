package com.gamify.infrastructure.repository;

import com.gamify.domain.model.Projeto;
import com.gamify.domain.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ProjetoRepositoryImpl implements ProjetoRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Projeto> findAll() {
        TypedQuery<Projeto> query = entityManager.createQuery("SELECT p FROM Projeto p", Projeto.class);
        return query.getResultList();
    }

    @Override
    public Projeto findByNome(String nome) {
        TypedQuery<Projeto> query = entityManager.createQuery("SELECT p FROM Projeto p WHERE p.nome = :nome", Projeto.class);
        query.setParameter("nome", nome);
        return query.getSingleResult();
    }

    // Outros métodos de persistência customizados se necessário
}
