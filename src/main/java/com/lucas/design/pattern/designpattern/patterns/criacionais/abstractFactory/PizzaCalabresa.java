package com.lucas.design.pattern.designpattern.patterns.criacionais.abstractFactory;

public class PizzaCalabresa extends PizzaFactory{
    @Override
    public String criarRecheio() {
        return "Calabresa";
    }

    @Override
    public String criarMassa() {
        return "Fina";
    }

    @Override
    public String criarBorda() {
        return "Recheada";
    }
}
