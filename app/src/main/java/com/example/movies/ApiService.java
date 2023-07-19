package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

//интерфейс с методами для работы в интернете
public interface ApiService {

    @GET("movie?token=CMED21H-VA2MW33-J596AQ5-X243NCG&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=40")
    Single<MovieResponse> loadMovies(@Query("page") int page);
}
