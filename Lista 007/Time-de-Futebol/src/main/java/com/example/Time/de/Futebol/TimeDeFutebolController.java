package com.example.Time.de.Futebol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TimeDeFutebolController {
    @RestController
    @RequestMapping("/time")

    public class TimeController {

        @Autowired
        private TimeService timeService;

        @GetMapping("/principal")
        public List<Jogador> listarTitulares(){
            return timeService.getTitulares();
        }

        @GetMapping("/reservas")
        public List<Jogador> listarReservas(){
            return timeService.getReservas();

        }

        @PutMapping("/jogador/{posicaoTitular}/{posicaoReserva}")
        public String substituirJogador(@PathVariable int posicaoTitular, @PathVariable int posicaoReserva){
            return timeService.substituirJogador(posicaoTitular, posicaoReserva);
        }
    }
}
