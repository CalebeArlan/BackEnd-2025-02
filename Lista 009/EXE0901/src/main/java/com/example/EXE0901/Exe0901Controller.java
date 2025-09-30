package com.example.EXE0901;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class Exe0901Controller {
    private final RestClient restClient;

    public Exe0901Controller() {
        this.restClient = RestClient.builder()
                .baseUrl("https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @GetMapping("/previsao")
    public String obterPrevisao() {
        String cidade = "Criciuma,BR";
        String key = "DLP4WSNVQXB9XBY3A8RWXRZCR";
        String url = "/timeline/" + cidade + "?unitGroup=metric&lang=pt&key=" + key;

        String resposta = restClient.get()
                .uri(url)
                .retrieve()
                .body(String.class);

        return resposta;
    }
}