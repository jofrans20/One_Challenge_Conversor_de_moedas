package alura.com.br.moedas_conversor;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConversorDeMoeda {
    private final String API_URL = "https://v6.exchangerate-api.com/v6/";
    private final String API_KEY = "471de1bf105c839006aa37a0";
    private final HttpClient client = HttpClient.newHttpClient();
    private final Gson gson = new Gson();
    private final Scanner sc = new Scanner(System.in);

    public void converte(String from, String to) {
        try {
            System.out.printf("Digite o valor em %s:%n", from);
            double valor = sc.nextDouble();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL + API_KEY + "/latest/" + from))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            TaxaDeCambio exchangeRateResponse = gson.fromJson(response.body(), TaxaDeCambio.class);
            double valorConvertido = valor * exchangeRateResponse.getConversion_rate(to);

            Dinheiro dinheiro = new Dinheiro(valor, from);
            Dinheiro dinheiroConvertido = new Dinheiro(valorConvertido, to);

            System.out.println("Valor inserido: " + dinheiro);
            System.out.println("Valor convertido: " + dinheiroConvertido);
        } catch (Exception e) {
            System.out.println("Erro ao realizar a conversão: " + e.getMessage());
        }
    }
}

