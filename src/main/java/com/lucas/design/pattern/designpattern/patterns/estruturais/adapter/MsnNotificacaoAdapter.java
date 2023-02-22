package com.lucas.design.pattern.designpattern.patterns.estruturais.adapter;

public class MsnNotificacaoAdapter implements Notificacao {

    private MsnNotificacaoLegado msnNotificacao;

    public MsnNotificacaoAdapter(MsnNotificacaoLegado msnNotificacao) {
        this.msnNotificacao = msnNotificacao;
    }

    @Override
    public void enviar(String msg) {
        msnNotificacao.enviarNotificacaoMsn(msg);
    }
}
