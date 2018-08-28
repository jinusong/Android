package com.example.dsm2018.weekend;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetAPI {
    @GET("/shop")
    Call<GetterSetter> shop_info();
}
