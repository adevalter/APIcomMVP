package com.gptecnologia.apicommvp.api

import com.gptecnologia.apicommvp.model.Postagem
import retrofit2.Response
import retrofit2.http.GET

interface JsonPlaceApi {
    @GET("posts")
    fun recuperarPostagem() : Response< List<Postagem>>
}