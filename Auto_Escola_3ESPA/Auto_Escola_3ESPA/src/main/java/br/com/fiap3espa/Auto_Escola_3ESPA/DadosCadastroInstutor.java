package br.com.fiap3espa.Auto_Escola_3ESPA;

import br.com.fiap3espa.Auto_Escola_3ESPA.endereco.DadosEndereco;

public record DadosCadastroInstutor(
        String nome,
        String email,
        String cnh,
        String especialidade,
        DadosEndereco endereço) {
}
