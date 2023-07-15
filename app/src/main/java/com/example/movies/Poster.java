package com.example.movies;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class Poster {

    public String getUrl() {
        return url;
    }

    public Poster(String url) {
        this.url = url;
    }
    @SerializedName("url")
    private String url;


    @NonNull
    @Override
    public String toString() {
        return "Poster{" +
                "url='" + url + '\'' +
                '}';
    }
}
