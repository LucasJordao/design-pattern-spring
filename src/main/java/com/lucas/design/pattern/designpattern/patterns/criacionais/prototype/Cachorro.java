package com.lucas.design.pattern.designpattern.patterns.criacionais.prototype;

public class Cachorro extends Animal{

    public Cachorro() {
    }

    public Cachorro(String cor, String nome) {
        super(cor, nome);
    }

    @Override
    public Animal clone() {
//        return this; shallow copy

//        deep copy
        return new Cachorro(super.getCor(), super.getNome());
    }
}
