package com.lucas.design.pattern.designpattern.patterns.estruturais.adapter;

public class EmailNotificacao implements Notificacao{
    @Override
    public void enviar(String msg) {
        System.out.println("Enviando notificacao via Email.");
    }
}
