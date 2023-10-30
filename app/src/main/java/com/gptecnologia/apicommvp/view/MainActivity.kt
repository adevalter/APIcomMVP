package com.gptecnologia.apicommvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.window.OnBackInvokedDispatcher
import com.gptecnologia.apicommvp.R
import com.gptecnologia.apicommvp.databinding.ActivityMainBinding
import com.gptecnologia.apicommvp.model.Postagem
import com.gptecnologia.apicommvp.model.PostagemApi
import com.gptecnologia.apicommvp.presenter.IPostagemPresenter
import com.gptecnologia.apicommvp.presenter.PostagemPresenter

class MainActivity : AppCompatActivity(),
    IPostagemPresenter{

    private val binding by lazy {
         ActivityMainBinding.inflate( layoutInflater)
    }
    private  lateinit var  postagemPresenter: PostagemPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val postagemApi = PostagemApi()
        postagemPresenter = PostagemPresenter( this,postagemApi )
    }

    override fun onStart() {
        super.onStart()
        postagemPresenter.recuperarPostagens()

    }

    override fun onDestroy() {
        postagemPresenter.onDestroy()
        super.onDestroy()

    }

    override fun exibirPostagem(lista: List<Postagem>) {
        var textoResultado = ""
        lista.forEach {postagem->
            textoResultado += "${postagem.id} - ${postagem.title} \n"
        }
        binding.textResultado.text = textoResultado
    }


}