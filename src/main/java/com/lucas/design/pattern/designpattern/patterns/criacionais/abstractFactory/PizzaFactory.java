package com.lucas.design.pattern.designpattern.patterns.criacionais.abstractFactory;

public interface PizzaFactory {
    String criarRecheio();
    String criarMassa();
    String criarBorda();
}
