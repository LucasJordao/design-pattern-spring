package com.lucas.design.pattern.designpattern.apis;

import com.lucas.design.pattern.designpattern.patterns.criacionais.builder.Builder;
import com.lucas.design.pattern.designpattern.patterns.estruturais.adapter.Tradutor;
import com.lucas.design.pattern.designpattern.patterns.estruturais.adapter.TradutorIngles;
import com.lucas.design.pattern.designpattern.patterns.estruturais.adapter.TradutorPortugues;
import com.lucas.design.pattern.designpattern.patterns.estruturais.adapter.TradutorPortuguesAdapter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/estruturais")
public class PadroesEstruturais {

    @GetMapping("/adapter")
    public ResponseEntity<?> adapterDesign(){
        Tradutor tradutorIngles = new TradutorIngles("Texto traduzido.");
        Tradutor tradutorPortugues = new TradutorPortuguesAdapter(new TradutorPortugues("Text translated."));

        System.out.println("Do português para inglês: " + tradutorIngles.traduzir());
        System.out.println("Do inglês para português: " + tradutorPortugues.traduzir());

        return ResponseEntity.ok(tradutorIngles.traduzir());
    }
}
