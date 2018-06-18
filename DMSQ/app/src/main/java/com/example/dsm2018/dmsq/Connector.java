package com.example.dsm2018.dmsq;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Connector {
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


    public void init(String date) {
        String baseUrl = "http://dsm2015.cafe24.com/";
        Retrofit client = new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).build();

        ApiService mTestService = client.create(ApiService.class);

        Call<model> call = mTestService.getAppinfo(date);
        Log.v("date", date);
        call.enqueue(new Callback<model>() {
            @Override
            public void onResponse(Call<model> call, Response<model> response) {

                if (response.isSuccessful()) {
                    Log.v("success", "우오아와와와ㅗ아ㅗ아ㅘ와와오");
                    model body = response.body();
                    for(int i = 0; i<body.breakfast.toArray().length; i++)
                    {
                        breakfast = body.breakfast.get((i));
                        getBreakfast();
                    }
                    for(int i = 0; i<body.lunch.toArray().length; i++)
                    {
                        lunch = body.lunch.get((i));
                        getLunch();
                    }
                    for(int i = 0; i<body.dinner.toArray().length; i++)
                    {
                        dinner = body.dinner.get((i));
                        getDinner();
                    }

                }else{
                    Log.v("errorBody()", response.errorBody().toString());
                }
            }


            @Override
            public void onFailure(Call<model> call, Throwable t) {
                Log.v("오류 발생", t.getMessage());
                t.printStackTrace();
            }
        });
    }
}
