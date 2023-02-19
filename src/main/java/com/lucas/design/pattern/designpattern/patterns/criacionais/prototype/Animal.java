package com.lucas.design.pattern.designpattern.patterns.criacionais.prototype;

public abstract class Animal {
    String cor;
    String nome;

    public Animal() {
    }

    public Animal(String cor, String nome) {
        this.cor = cor;
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract Animal clone();
}
