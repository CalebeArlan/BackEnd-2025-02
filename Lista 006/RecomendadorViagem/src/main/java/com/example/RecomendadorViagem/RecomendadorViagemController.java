package com.example.RecomendadorViagem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecomendadorViagemController {

    @GetMapping("/")
    public String RecomendaViagem(@RequestParam String clima, @RequestParam String estilo) {
        if (clima.equals("calor") && estilo.equals("natureza")) {
            return "Rio de Janeiro";
        }
        if (clima.equals("frio") && estilo.equals("natureza")) {
            return "Serra do Rio do Rastro";
        }
        if (clima.equals("calor") && estilo.equals("urbano")) {
            return "São Paulo";
        }
        if (clima.equals("frio") && estilo.equals("urbano")) {
            return "Três Cachoeiras";
        } else {
            return "404 - Não encontrado";
        }
    }
}
