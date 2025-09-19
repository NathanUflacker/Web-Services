package br.com.fiap3espa.Auto_Escola_3ESPA.controller;

import br.com.fiap3espa.Auto_Escola_3ESPA.DadosCadastroInstutor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutores")
public class InstrutorController {

    @PostMapping
    //Com RequestBody ele entende que precisa pegar o corpo do JSON e colocar na variável
    public void cadastrarInstrutor(@RequestBody DadosCadastroInstutor dados){
        System.out.println(dados.nome());
    }

}
