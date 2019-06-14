package com.example.search_movie;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class client {

    private static Retrofit r;
    public static Retrofit getins(){
        if(r==null)
        {
            r=new Retrofit.Builder().baseUrl("https://api.themoviedb.org/3/").addConverterFactory(GsonConverterFactory.create()).build();


        }
        return r;
    }
}
