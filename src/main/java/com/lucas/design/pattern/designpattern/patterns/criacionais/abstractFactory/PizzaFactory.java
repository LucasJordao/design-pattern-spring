package com.lucas.design.pattern.designpattern.patterns.criacionais.abstractFactory;

public abstract class PizzaFactory {
    public abstract String criarRecheio();
    public abstract String criarMassa();
    public abstract String criarBorda();
}
