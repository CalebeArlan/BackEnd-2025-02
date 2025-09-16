package com.example.Time.de.Futebol;

import com.example.Time.de.Futebol.Jogador;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TimeService {

    private List<Jogador> jogadores = new ArrayList<>();

    public TimeService() {
        inicializarTime();
    }


    private void inicializarTime() {
        for (int i = 0; i < 11; i++) {
            jogadores.add(new Jogador("Titular " + i, "Posição " + i, 20 + i));
        }
        for (int i = 11; i < 16; i++) {
            jogadores.add(new Jogador("Reserva " + i, "Posição " + i, 18 + i));
        }
    }

    public List<Jogador> getTitulares(){
        return jogadores.subList(0, 11);
    }

    public List<Jogador> getReservas(){
        return jogadores.subList(11, jogadores.size());
    }

    public String substituirJogador(int posicaoTitular, int posicaoReserva){
        if(posicaoTitular < 0 || posicaoTitular >= 11){
            return "A posição do titular deve estar entre 0 e 10";
        }
        if(posicaoReserva < 11 || posicaoReserva >= jogadores.size()){
            return "A posição do reserva deve estar entre 11 e 15";
        }

        Jogador titular = jogadores.get(posicaoTitular);
        Jogador reserva = jogadores.get(posicaoReserva);

        return "Substituição realizada: " + reserva.getNome() + " entrou no lugar de " + titular.getNome();

    }
}