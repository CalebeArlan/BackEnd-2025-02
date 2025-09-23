package com.example.TabelaFipe.dto;

public class CarroResponse {
    private String marca;
    private String modelo;
    private String ano;
    private String valor;

    public CarroResponse(String marca, String modelo, String ano, String valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    // Getters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getAno() { return ano; }
    public String getValor() { return valor; }
}
