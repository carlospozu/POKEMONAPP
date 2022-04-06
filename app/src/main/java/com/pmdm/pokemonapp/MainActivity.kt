package com.pmdm.pokemonapp

import ObtenerPokemonRequest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.pmdm.pokemonapp.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {


    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.descarga.setOnClickListener{
            lifecycleScope.launch(Dispatchers.IO) {
                val listaPokemon = ObtenerPokemonRequest.get()
                listaPokemon.imprimirPokemons()
            }

        }


    }
}