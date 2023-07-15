package com.example.movies;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

//Реализация интерфейса ApiService
public class ApiFactory {

    private static final String BASE_URL = "https://api.kinopoisk.dev/v1.3/";

    private static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build();

    //Получение экземпляра ApiService, упрощенная реализация паттерна Singletone
    // (для получения объекта параметры не передаются)
    public static final ApiService apiService = retrofit.create(ApiService.class);
}
