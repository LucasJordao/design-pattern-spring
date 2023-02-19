package com.lucas.design.pattern.designpattern.patterns.criacionais.abstractFactory;

public class PizzaQueijo implements PizzaFactory{

    @Override
    public String criarRecheio() {
        return "Queijo";
    }

    @Override
    public String criarMassa() {
        return "Fina";
    }

    @Override
    public String criarBorda() {
        return "Sem recheio";
    }
}
