package com.example.weatherclothes_java.API;

import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class WeatherAPIClient {

    public void get(String requestURL){
        try{
            OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new CookiesInterceptor())
                .addNetworkInterceptor(new CookiesInterceptor())
                .build();

            Request request = new Request.Builder()
                    .url(requestURL)
                    .build();

            Response response = client.newCall(request).execute();
            String message = response.body().string();
            System.out.println(message);

        } catch (Exception e){
            System.err.println(e.toString());

        }
    }

}
