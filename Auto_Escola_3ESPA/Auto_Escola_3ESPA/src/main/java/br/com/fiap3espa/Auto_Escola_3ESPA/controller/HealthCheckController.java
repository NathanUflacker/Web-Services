package br.com.fiap3espa.Auto_Escola_3ESPA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health-check")// Agora o Spring reconhece essa classe como Rest Check
public class HealthCheckController {


    @GetMapping
    public String healthCheck(){
        return "Verificação de Integridade Auto Escola 3ESPA";
    }
}
