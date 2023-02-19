package com.lucas.design.pattern.designpattern.patterns.criacionais.builder;

public class Builder {

    public Builder(){}

    public Car generateCar(){
        return Car.builder()
                .cor("red")
                .marca("Chevrolet")
                .modelo("Onix")
                .placa("Q3K9S2")
                .build();
    }
}
