package com.example.exemplo_repositorio.services;

import com.example.exemplo_repositorio.models.Jogador;
import com.example.exemplo_repositorio.repositories.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {

    private JogadorRepository jogadorRepository;

    public JogadorService(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    public Jogador saveJogador(String nome, String sobrenome, String posicao){
        Jogador novoJogador = new Jogador();

        novoJogador.setNome(nome);
        novoJogador.setSobrenome(sobrenome);
        novoJogador.setClube("Criciúma");
        novoJogador.setIdade(19);
        novoJogador.setPosicao(posicao);
        jogadorRepository.save(novoJogador);
        return novoJogador;
    }

    public List<Jogador> getAllJogadores(){
        return jogadorRepository.findAll();
    }

    public Jogador getJogador(String nome){
        return jogadorRepository.findByNome(nome).orElseThrow(() -> new RuntimeException("Jogador não encontrado"));
    }

    public Jogador deleteJogador(String nome){
        return jogadorRepository.deleteByNome(nome).orElseThrow(() -> new RuntimeException("Jogador não encontrado"));
    }
}
