package com.lucas.design.pattern.designpattern.patterns.estruturais.bridge;

public class EmailEnvioNotificacao implements EnvioNotificacao{
    @Override
    public void send(String msg) {
        System.out.println("Enviando mensagem via email.");
    }
}
