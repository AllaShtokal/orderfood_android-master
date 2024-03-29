package com.example.milymozz.orderfood.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;



public class IGeoRetrofit {
    private static Retrofit retrofit = null;

    public static Retrofit getGoogleClient(String baseURL) {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(ScalarsConverterFactory.create()) // String При обработке
                    .build();
        }

        return retrofit;
    }
}
