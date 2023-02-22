package com.lucas.design.pattern.designpattern.apis;

import com.lucas.design.pattern.designpattern.patterns.estruturais.adapter.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping(value = "/estruturais")
public class PadroesEstruturais {

    @GetMapping("/adapter")
    public ResponseEntity<?> adapterDesign(){
        Notificacao[] notificacaos = {new MsnNotificacaoAdapter(new MsnNotificacaoLegado()), new EmailNotificacao(), new SmsNotificacao()};

        Arrays.stream(notificacaos).forEach(notificacao -> {
            notificacao.enviar("teste");
        });

        return ResponseEntity.ok("Ok");
    }
}
