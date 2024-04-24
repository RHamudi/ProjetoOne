package com.alura.conversor.request;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestAPI {
    public static double RequestExchange(String baseMoney, String convertMoney){
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = null;
        URI url_str = URI.create("https://v6.exchangerate-api.com/v6/ad2bc4f3c881741cb2309655/latest/" + baseMoney);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(url_str)
                .build();

        try {
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            // Convert to JSON
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(response.body());
            JsonObject jsonobj = root.getAsJsonObject();

            String req_result = jsonobj.getAsJsonObject("conversion_rates").get(convertMoney).getAsString();
            // System.out.println(req_result);
            return Double.parseDouble(req_result);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não consegui recuperar o endereço a partir desse cep");
        }
    }
}
