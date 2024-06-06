import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ExchangeRate {


    public static void pairConversion(String base, String target, double pesos) throws IOException, InterruptedException {
        String conversion = "https://v6.exchangerate-api.com/v6/e8acb026e5ce99f5126fa261/pair/" + base + "/" + target + "/" + pesos;


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(conversion))
                .build();


        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String result = response.body();

        Gson gson = new Gson();
        Moneda moneda = gson.fromJson(result, Moneda.class);
        moneda.showConversion();

    }


}
