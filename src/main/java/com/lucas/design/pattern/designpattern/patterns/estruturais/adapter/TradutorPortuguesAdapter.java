package com.lucas.design.pattern.designpattern.patterns.estruturais.adapter;

public class TradutorPortuguesAdapter implements Tradutor{

    private TradutorPortugues tradutorPortugues;

    public TradutorPortuguesAdapter(TradutorPortugues tradutorPortugues) {
        this.tradutorPortugues = tradutorPortugues;
    }

    @Override
    public String traduzir() {
        return tradutorPortugues.traduzirPortugues();
    }
}
