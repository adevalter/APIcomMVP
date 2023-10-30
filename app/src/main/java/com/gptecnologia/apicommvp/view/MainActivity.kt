package com.gptecnologia.apicommvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gptecnologia.apicommvp.R
import com.gptecnologia.apicommvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
         ActivityMainBinding.inflate( layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

    }
}