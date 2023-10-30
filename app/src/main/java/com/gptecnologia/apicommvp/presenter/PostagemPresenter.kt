package com.gptecnologia.apicommvp.presenter

import android.util.Log
import com.gptecnologia.apicommvp.api.RetrofitService
import com.gptecnologia.apicommvp.model.Postagem
import com.gptecnologia.apicommvp.model.PostagemApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.Retrofit

class PostagemPresenter(
    private val view: IPostagemPresenter,
    private val postagemApi: PostagemApi
) {

    private val coroutine = CoroutineScope(Dispatchers.IO)
    fun recuperarPostagens(){
       coroutine.launch {
           val postagens = postagemApi.recuperarPostagens()
           //Log.i("Lista", "recuperarPostagens: $postagens")
           withContext(Dispatchers.Main){
               view.exibirPostagem( postagens)
           }
       }
    }
    fun onDestroy(){
        coroutine.cancel()
    }
}