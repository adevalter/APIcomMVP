package com.gptecnologia.apicommvp.model

import com.gptecnologia.apicommvp.api.RetrofitService
import retrofit2.Response

class PostagemApi {

    suspend fun recuperarPostagens() : List<Postagem>{

        val jsonPlace = RetrofitService.recuperarJsonPlace()
        var retorno: Response<List<Postagem>>? = null
        try {
            retorno = jsonPlace.recuperarPostagem()
            if(retorno.isSuccessful){
                retorno.body()?.let{ postagens->
                    return postagens

                }
            }

        }catch (erroRecuperarPostagem: Exception){
            erroRecuperarPostagem.printStackTrace()
        }

        return emptyList()
    }
}