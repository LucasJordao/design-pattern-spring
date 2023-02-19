package com.lucas.design.pattern.designpattern.patterns.criacionais.builder;

public class Car {
    private String cor;
    private String modelo;
    private String placa;
    private String marca;

    public String getCor() {
        return cor;
    }

    private void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    public static CarBuilder builder(){
        return new CarBuilder();
    }

    public static class CarBuilder{

        private static Car car = new Car();

        public CarBuilder cor(String cor){
            car.setCor(cor);
            return this;
        }

        public CarBuilder modelo(String modelo){
            car.setModelo(modelo);
            return this;
        }

        public CarBuilder marca(String marca){
            car.setMarca(marca);
            return this;
        }

        public CarBuilder placa(String placa){
            car.setPlaca(placa);
            return this;
        }

        public Car build(){
            return car;
        }
    }
}
