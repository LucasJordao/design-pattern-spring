package com.lucas.design.pattern.designpattern.patterns.criacionais.factorymethod;

public class Pix extends Transfer {
    private String copiaCola;

    public Pix(String copiaCola) {
        this.copiaCola = copiaCola;
    }

    public Pix(Double valor, Double taxa, String copiaCola) {
        super(valor, taxa);
        this.copiaCola = copiaCola;
    }

    public String getCopiaCola() {
        return copiaCola;
    }
}
