package com.gptecnologia.apicommvp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService{
    fun recuperarJsonPlace(): JsonPlaceApi {
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create( JsonPlaceApi::class.java)
    }
}