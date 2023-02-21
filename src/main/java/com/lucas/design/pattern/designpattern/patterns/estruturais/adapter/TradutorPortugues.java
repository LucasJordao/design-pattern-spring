package com.lucas.design.pattern.designpattern.patterns.estruturais.adapter;

public class TradutorPortugues {

    private String fileName;

    public TradutorPortugues(String fileName) {
        this.fileName = fileName;
    }

    public String traduzirPortugues(){
        return "Texto traduzido.";
    }
}
