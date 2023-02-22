package com.lucas.design.pattern.designpattern.patterns.estruturais.adapter;

public class SmsNotificacao implements Notificacao{
    @Override
    public void enviar(String msg) {
        System.out.println("Enviando mensagem via SMS.");
    }
}
