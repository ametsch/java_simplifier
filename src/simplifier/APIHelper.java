/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class APIHelper {
    private APIHelper(){}


    public static String request_rapidAPI_XML(String URL_With_Query, String x_rapidapi_key, String x_rapidapi_host) throws IOException, InterruptedException {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(URL_With_Query+"&format=xml"))
                    .header("x-rapidapi-key", x_rapidapi_key)
                    .header("x-rapidapi-host", x_rapidapi_host)
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
           return response.body();
    }

    public static String request_rapidAPI_JSON(String URL_With_Query, String x_rapidapi_key, String x_rapidapi_host) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL_With_Query+"&format=json"))
                .header("x-rapidapi-key", x_rapidapi_key)
                .header("x-rapidapi-host", x_rapidapi_host)
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }


}
