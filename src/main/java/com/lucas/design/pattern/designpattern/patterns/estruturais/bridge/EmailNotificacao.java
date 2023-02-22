package com.lucas.design.pattern.designpattern.patterns.estruturais.bridge;

public class EmailNotificacao extends Notificacao{

    private EnvioNotificacao envio;

    public EmailNotificacao(EnvioNotificacao envio) {
        this.envio = envio;
    }

    @Override
    void notificar(String msg) {
        envio.send(msg);
    }
}
