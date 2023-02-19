package com.lucas.design.pattern.designpattern.patterns.criacionais.factorymethod;

public class PixFactory implements TransferFactory{
    @Override
    public Transfer realizarTransferencia(Double valor) {
        return new Pix(valor, valor * 5/100, "http://qrcode-pix-teste");
    }
}
