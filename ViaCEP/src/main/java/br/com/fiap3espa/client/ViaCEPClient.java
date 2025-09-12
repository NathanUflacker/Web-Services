package br.com.fiap3espa.client;

import br.com.fiap3espa.exception.CEPNotFoundException;
import br.com.fiap3espa.model.EnderecoDTO;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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

        JsonObject jsonobject = JsonParser.parseString(JSONresponse).getAsJsonObject();

        if(jsonobject.has("erro") && jsonobject.get("erro").getAsBoolean()){
            throw new CEPNotFoundException("CEP não encontrado na base de dados");
        }

        Gson gson = new Gson();
        return gson.fromJson(JSONresponse, EnderecoDTO.class);
    }
}
