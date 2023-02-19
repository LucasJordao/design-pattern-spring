package com.lucas.design.pattern.designpattern.patterns.criacionais.abstractFactory;

public class Pizza {
    private String borda;
    private String recheio;
    private String massa;

    public Pizza() {
    }

    public String getBorda() {
        return borda;
    }

    public void setBorda(String borda) {
        this.borda = borda;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }
}
