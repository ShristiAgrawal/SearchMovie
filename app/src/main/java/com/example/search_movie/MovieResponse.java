package com.example.search_movie;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResponse {
    @SerializedName("results")
    private List<Movies> list;

    public List<Movies> getList() {
        return list;
    }
}
