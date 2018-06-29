package com.example.dsm2018.dmsq;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("meal/{date}")         //baseUr l에 추가할 내용
    Call<model> getAppinfo(@Path("date") String date);      //model 의 형태로 값을 받아올거라고 추상 설정

}
