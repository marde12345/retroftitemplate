package com.example.retrofit;

import com.example.retrofit.model.Coba;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface API {

    @Headers("Accept: application/json")
    @GET("/request_handler.php")
    Call<Coba> getCoba();

}
