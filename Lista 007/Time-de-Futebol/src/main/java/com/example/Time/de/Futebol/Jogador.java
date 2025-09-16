package com.example.Time.de.Futebol;

public class Jogador {
    String nome;
    String posicao;
    int idade;

    public Jogador(String nome, String posicao, int idade){
        this.nome = nome;
        this.posicao = posicao;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getPosicao() { return posicao; }
    public void setPosicao(String posicao) { this.posicao = posicao; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

}
