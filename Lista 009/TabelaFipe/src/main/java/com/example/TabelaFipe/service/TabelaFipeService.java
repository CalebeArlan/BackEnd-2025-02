package com.example.TabelaFipe.service;

import com.example.TabelaFipe.dto.CarroRequest;
import com.example.TabelaFipe.dto.CarroResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Map;

@Service
public class TabelaFipeService {

    private static final String BASE_URL = "https://parallelum.com.br/fipe/api/v1/carros";

    public CarroResponse consultaFipe(CarroRequest request) {
        RestTemplate restTemplate = new RestTemplate();

        var marcas = restTemplate.getForObject(BASE_URL + "/marcas", Object[].class);


        String url = BASE_URL + "/marcas/" + request.getMarca()
                + "/modelos/" + request.getModelo()
                + "/anos/" + request.getAno();

        Map<String, Object> resposta = restTemplate.getForObject(url, Map.class);

        String valor = (String) resposta.get("Valor");

        return new CarroResponse(
                request.getMarca(),
                request.getModelo(),
                request.getAno(),
                valor
        );
    }
}
