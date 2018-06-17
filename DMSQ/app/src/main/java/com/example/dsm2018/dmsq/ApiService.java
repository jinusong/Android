package com.example.dsm2018.dmsq;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    public static final String API_URL = "http://dsm2015.cafe24.com/";

    @GET("meal/{date}")
    Call<ResponseBody> getCommentStr(@Path("date") String date);

}
