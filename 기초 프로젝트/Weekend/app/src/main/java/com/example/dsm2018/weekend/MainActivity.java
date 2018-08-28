package com.example.dsm2018.weekend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    String BaseUrl = "앙기모띠";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShopView();
    }

    public void ShopView(){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BaseUrl)
                .build();

        GetAPI Service = retrofit.create(GetAPI.class);

        Call<GetterSetter> call = Service.shop_info();
        call.enqueue(new Callback<GetterSetter>(){
            @Override
            public void onResponse(Call<GetterSetter> call, Response<GetterSetter> response){

            }

            @Override
            public void onFailure(Call<GetterSetter> call, Throwable t) {

            }
        });
    }
}
