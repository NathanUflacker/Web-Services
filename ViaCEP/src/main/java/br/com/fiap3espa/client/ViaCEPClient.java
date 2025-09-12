package br.com.fiap3espa.client;

import br.com.fiap3espa.model.EnderecoDTO;
import com.google.gson.Gson;
import org.apache.http.client.fluent.Request;

import java.io.IOException;

public class ViaCEPClient {
    public static EnderecoDTO getEndereco(String cep) throws IOException {
        String url = "https://viacep.com.br/ws/"+ cep +"/json/";

        String JSONresponse = Request.Get(url)
                .connectTimeout(10000)
                .socketTimeout(10000)
                .execute()
                .returnContent()
                .asString();

        Gson gson = new Gson();
        return gson.fromJson(JSONresponse, EnderecoDTO.class);
    }
}
