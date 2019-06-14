package com.example.search_movie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface service {

    @GET("search/movie")
    Call<MovieResponse> getMovieResponse(@Query("api_key") String api,@Query("query") String q);
}
