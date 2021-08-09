package com.koala.java1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * day10：全新的Http客户端API
 * Create by koala on 2021-08-07
 */
public class HttpClientTest {

    public static void main(String[] args) {
        //jdk9 中使用 HttpClient替换原有的HttpURLConnection
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest req = HttpRequest.newBuilder(URI.create("http://www.atguigu.com")).GET().build();

            HttpResponse<String> response = null;
            response = client.send(req, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            System.out.println(response.version().name());
            System.out.println(response.body());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
