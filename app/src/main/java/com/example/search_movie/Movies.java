package com.example.search_movie;

import com.google.gson.annotations.SerializedName;

public class Movies {
    @SerializedName("id")
    private int id;
    @SerializedName("original_title")
    private String original_title;

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public int getId() {
        return id;
    }

    public String getOriginal_title() {
        return original_title;
    }
}
