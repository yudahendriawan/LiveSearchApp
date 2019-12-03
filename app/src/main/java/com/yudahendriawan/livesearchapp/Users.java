package com.yudahendriawan.livesearchapp;

import com.google.gson.annotations.SerializedName;

public class Users {

    @SerializedName("id") private int id;
    @SerializedName("name") private String name;
    @SerializedName("email") private String email;

    public Users() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
