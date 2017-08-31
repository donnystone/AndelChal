package com.example.princess.andelachallenge;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Princess on 4/23/2017.
 */
//This method initialize the Retrofit, call the base url, convert JSON to app format and builds
public class RestApiBuilder {

    public static final String BASE_URL = "https://api.github.com";

    private Retrofit retrofit;

    public RestApiBuilder() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
//This method points to the service class
    public RestApiService getService() {
        return retrofit.create(RestApiService.class);
    }
}
