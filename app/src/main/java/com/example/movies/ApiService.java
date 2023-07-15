package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

//интерфейс с методами для работы в интернете
public interface ApiService {

    @GET("movie?token=CMED21H-VA2MW33-J596AQ5-X243NCG&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&page=2&limit=5")
    Single<MovieResponse> loadMovies();
}
