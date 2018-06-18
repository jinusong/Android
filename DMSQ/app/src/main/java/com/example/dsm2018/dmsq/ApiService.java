package com.example.dsm2018.dmsq;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("meal/{date}")
    Call<model> getAppinfo(@Path("date") String date);

}
