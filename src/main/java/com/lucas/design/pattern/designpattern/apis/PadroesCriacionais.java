package com.lucas.design.pattern.designpattern.apis;

import com.lucas.design.pattern.designpattern.patterns.criacionais.abstractFactory.Pizza;
import com.lucas.design.pattern.designpattern.patterns.criacionais.abstractFactory.PizzaCalabresa;
import com.lucas.design.pattern.designpattern.patterns.criacionais.abstractFactory.PizzaFactory;
import com.lucas.design.pattern.designpattern.patterns.criacionais.abstractFactory.PizzaQueijo;
import com.lucas.design.pattern.designpattern.patterns.criacionais.builder.Builder;
import com.lucas.design.pattern.designpattern.patterns.criacionais.factorymethod.PixFactory;
import com.lucas.design.pattern.designpattern.patterns.criacionais.factorymethod.TransferFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping(value = "/criacionais")
class PadroesCriacionais {

    @GetMapping("/builder")
    public ResponseEntity<?> builderDesign(){
        Builder builderPattern = new Builder();

        return ResponseEntity.ok(builderPattern.generateCar());
    }

    @GetMapping("/factoryMethod")
    public ResponseEntity<?> factoryMethodDesign(){
        TransferFactory transferPix = new PixFactory();

        return ResponseEntity.ok(transferPix.realizarTransferencia(2000.0));
    }

    @GetMapping("/abstractFactory")
    public ResponseEntity<?> abstractFactoryDesign(){
        PizzaFactory pizzaFactory = null;
        String pizza = "queijo";
        if(pizza == "queijo"){
            pizzaFactory = new PizzaQueijo();
        }else{
            pizzaFactory = new PizzaCalabresa();
        }

        Pizza pizzaFinal = new Pizza();
        pizzaFinal.setBorda(pizzaFactory.criarBorda());
        pizzaFinal.setMassa(pizzaFactory.criarMassa());
        pizzaFinal.setRecheio(pizzaFactory.criarRecheio());

        return ResponseEntity.ok(pizzaFinal);
    }

}