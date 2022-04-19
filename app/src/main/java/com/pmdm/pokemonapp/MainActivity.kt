package com.pmdm.pokemonapp



import Pokemon
import PokemonResponse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson

import com.pmdm.pokemonapp.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.*
import java.io.IOException


class MainActivity : AppCompatActivity() {


    private lateinit var  binding: ActivityMainBinding
    lateinit var adapter: AdapterPokemon


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        llamada()
    }
        fun llamada(){
            val client = OkHttpClient()
            val listaPokemon = mutableListOf<Pokemon>()

                val request = Request.Builder()
                request.url("https://pokeapi.co/api/v2/pokemon/")

            val call = client.newCall(request.build())
            call.enqueue( object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    println(e.toString())
                    CoroutineScope(Dispatchers.Main).launch {
                        Toast.makeText(this@MainActivity, "Algo ha ido mal", Toast.LENGTH_SHORT).show()
                    }
                }
                override fun onResponse(call: Call, response: Response) {
                    println(response.toString())
                    response.body?.let { responseBody ->
                        val body = responseBody.string()
                        println(body)
                        val gson = Gson()

                        val person = gson.fromJson(body, PokemonResponse::class.java)

                        CoroutineScope(Dispatchers.Main).launch {
                            person.results.forEach {
                                listaPokemon.add(it)
                            }
                            adapter(listaPokemon)

                        }
                    }
                }
            })}


    fun adapter(lista:  MutableList<Pokemon>) {
        adapter = AdapterPokemon(lista)
        binding.recyclerview.layoutManager = LinearLayoutManager(this@MainActivity)
        binding.recyclerview.adapter = adapter
    }
}