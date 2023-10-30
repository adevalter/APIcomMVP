package com.gptecnologia.apicommvp.presenter

import com.gptecnologia.apicommvp.api.RetrofitService
import com.gptecnologia.apicommvp.model.Postagem
import com.gptecnologia.apicommvp.model.PostagemApi
import retrofit2.Response
import retrofit2.Retrofit

class PostagemPresenter {

    fun recuperarPostagens(){
       val postagemApi = PostagemApi()
        val postagens = postagemApi.recuperarPostagens()
    }
}