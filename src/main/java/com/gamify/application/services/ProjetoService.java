package com.gamify.application.services;

import com.gamify.domain.model.Projeto;
import com.gamify.domain.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public Projeto criarProjeto(String nome, Long idEquipe) {
        // Lógica para criar um novo projeto
        // Aqui, você poderia adicionar regras de negócio (ex: verificar se a equipe já está associada a outro projeto)
        Projeto projeto = new Projeto(nome, null); // Equipe será associada depois
        return projetoRepository.save(projeto);
    }

    public Projeto buscarProjetoPorNome(String nome) {
        return projetoRepository.findByNome(nome);
    }

    public void finalizarProjeto(Long idProjeto) {
        Projeto projeto = projetoRepository.findById(idProjeto).orElseThrow(() -> new RuntimeException("Projeto não encontrado"));
        projeto.setAtivo(false);
        projetoRepository.save(projeto);
    }
}
