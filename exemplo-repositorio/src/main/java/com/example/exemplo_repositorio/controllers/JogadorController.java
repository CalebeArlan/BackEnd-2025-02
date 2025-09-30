package com.example.exemplo_repositorio.controllers;

import com.example.exemplo_repositorio.models.Jogador;
import com.example.exemplo_repositorio.services.JogadorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogador")
public class JogadorController {
    private JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService){
        this.jogadorService = jogadorService;
    }

    @PostMapping
    public Jogador saveJogador(@RequestBody Jogador jogador){
        return jogadorService.saveJogador(jogador.getNome(), jogador.getSobrenome(), jogador.getPosicao());
    }

    @GetMapping("jogador")
    public List<Jogador> getAllJogador(){
        return jogadorService.getAllJogadores();
    }

    @GetMapping("/{nome}")
    public Jogador getJogador(@PathVariable String nome){
        return jogadorService.getJogador(nome);
    }

    @DeleteMapping("/{nome}")
    public void deleteJogador(@PathVariable String nome){
        jogadorService.deleteJogador(nome);
    }
}
