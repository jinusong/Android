package com.example.dsm2018.dmsq;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Date;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class Connector {
    Retrofit retrofit;
    ApiService apiService;

    String breakfast;
    String lunch;
    String dinner;

    public String getBreakfast() {
        return breakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public String getDinner() {
        return dinner;
    }


    private void setContentView(int fragment_meal) {
    }


    public void init(String date) {

        retrofit = new Retrofit.Builder().baseUrl(ApiService.API_URL).build();
        apiService = retrofit.create(ApiService.class);

        //get
        Call<ResponseBody> comment = apiService.getCommentStr(date);

        Log.d("start Retrofit", date);
        comment.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    String result = response.body().string();
                    Log.v("06-17", result);
                    try {
                        JSONArray jsonArray = new JSONArray(result);

                        for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject jsonObject = jsonArray.getJSONObject(i);
                            breakfast = jsonObject.getString("breakfast");
                            lunch = jsonObject.getString("lunch");
                            dinner = jsonObject.getString("dinner");
                            Log.v("06-17", jsonObject.toString());
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d("fail", t.toString());
            }
        });
    }
}
