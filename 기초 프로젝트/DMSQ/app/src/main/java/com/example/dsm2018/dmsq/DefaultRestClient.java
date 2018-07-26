package com.example.dsm2018.dmsq;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DefaultRestClient<T> {

    private T service;
    private String baseUrl = "http://dsm2015.cafe24.com/";

    public T getClient(Class<? extends T> type) {
        if (service == null) {
            OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {

                    Request original = chain.request();

                    Request request = original.newBuilder()
                            .header("ex-hader", "sample")
                            .method(original.method(), original.body())
                            .build();

                    return chain.proceed(request);
                }
            }).build();

            Retrofit client = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    //.client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            service = client.create(type);

        }
        return service;
    }

}
