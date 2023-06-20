import java.net.http.HttpClient;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {
    public String verificateEmail(String email) {
        String address = "https://api.mailcheck.ai/email/" + email;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(address))
        .build();

        HttpResponse<String> response;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();
            ApiResponse apiResponse = ApiResponse.fromJson(responseBody);
            if (apiResponse.getDisposable().equals("true")) {
                return "O email é falso!";
            } else {
                return "O email é verdadeiro!";
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
