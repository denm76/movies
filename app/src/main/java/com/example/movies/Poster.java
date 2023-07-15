package com.example.movies;

import com.google.gson.annotations.SerializedName;

public class Poster {

    public String getURL() {
        return URL;
    }

    public Poster(String URL) {
        this.URL = URL;
    }
    @SerializedName("URL")
    private String URL;


}
