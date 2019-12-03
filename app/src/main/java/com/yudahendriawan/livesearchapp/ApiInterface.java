package com.yudahendriawan.livesearchapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("getUsers.php")
    Call<List<Users>> getUsers(@Query("key") String keyword);

}
