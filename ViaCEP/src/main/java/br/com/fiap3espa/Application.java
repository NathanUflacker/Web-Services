package br.com.fiap3espa;

import br.com.fiap3espa.client.ViaCEPClient;
import br.com.fiap3espa.model.EnderecoDTO;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CEP: ");
        String cep = sc.next();
        EnderecoDTO endereco = ViaCEPClient.getEndereco(cep);

        System.out.println("CEP: " + endereco.cep());
        System.out.println("CEP: " + endereco.logradouro());
        System.out.println("CEP: " + endereco.bairro());
        System.out.println("CEP: " + endereco.localidade());
        System.out.println("CEP: " + endereco.estado());
        System.out.println("CEP: " + endereco.regiao());


    }
}
