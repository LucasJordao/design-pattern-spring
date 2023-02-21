package com.lucas.design.pattern.designpattern.patterns.estruturais.adapter;

public class TradutorIngles implements Tradutor{

    public TradutorIngles(String texto){};

    @Override
    public String traduzir() {
        return "Translated text.";
    }
}
