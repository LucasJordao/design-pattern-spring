package com.lucas.design.pattern.designpattern.patterns.criacionais.factorymethod;

public class Transfer {
    private Double valor;
    private Double taxa;

    public Transfer(){}

    public Transfer(Double valor, Double taxa) {
        this.valor = valor;
        this.taxa = taxa;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
}
