package com.example.TabelaFipe.controller;

import com.example.TabelaFipe.dto.CarroRequest;
import com.example.TabelaFipe.dto.CarroResponse;
import com.example.TabelaFipe.service.TabelaFipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fipe")
public class TabelaFipeController {

    @Autowired
    private TabelaFipeService tabelaFipeService;

    @PostMapping("/consulta")
    public CarroResponse consulta(@RequestBody CarroRequest request) {
        return tabelaFipeService.consultaFipe(request);
    }
}
