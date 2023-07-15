package com.example.movies;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class Rating {
    @SerializedName("kp")
    private String kp;

    @NonNull
    @Override
    public String toString() {
        return "Rating{" +
                "kp='" + kp + '\'' +
                '}';
    }

    public Rating(String kp) {
        this.kp = kp;
    }

    public String getKp() {
        return kp;
    }
}
