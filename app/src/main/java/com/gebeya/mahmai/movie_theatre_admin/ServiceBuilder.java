package com.gebeya.mahmai.movie_theatre_admin;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceBuilder {

    //Create Logger
    private static HttpLoggingInterceptor logger =
            new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    //Create OkHttp client
    private static OkHttpClient.Builder okHttp =
            new OkHttpClient.Builder()
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .writeTimeout(30, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .addInterceptor(logger);


    private static String BASE_URL = "http://mta.api.etde.gebeya.io/ticket/";
    private static Retrofit.Builder builder = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(okHttp.build());
    private static Retrofit retrofit = builder.build();


    public static <S> S buildService(Class<S> serviceType) {
        return retrofit.create(serviceType);
    }
}
