package com.gptecnologia.apicommvp.presenter

import com.gptecnologia.apicommvp.model.Postagem

interface IPostagemPresenter {

    fun exibirPostagem(lista : List<Postagem>)
    fun carregando( exibirCarregando: Boolean )
}