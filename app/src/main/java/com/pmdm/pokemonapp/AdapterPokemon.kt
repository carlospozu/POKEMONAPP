package com.pmdm.pokemonapp

import Pokemon
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView

import com.pmdm.pokemonapp.databinding.ItempokemonBinding


class AdapterPokemon(var lista: MutableList<Pokemon>) :
    RecyclerView.Adapter<AdapterPokemon.TextoViewHolder>() {

    class TextoViewHolder(var itemBinding: ItempokemonBinding) :
        RecyclerView.ViewHolder(itemBinding.root)
//CANTIDAD QUE QUIERES DEVOLVER
    override fun getItemCount(): Int {
        return lista.size
    }
//IGUAL SIEMPRE
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextoViewHolder {
        val binding = ItempokemonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TextoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TextoViewHolder, position: Int) {


        holder.itemBinding.nombrePokemon.text = lista[position].name
       // holder.itemBinding.fotoPokemon.setImageURI(lista[position].sprites.frontDefault.toUri())  //ID DEL TEXTVIEW
        holder.itemBinding.cl1.setOnClickListener {
            holder.itemBinding.cl1.setBackgroundColor(ContextCompat.getColor(holder.itemView.context, R.color.green))
        //ID DEL LAYAUT
          //  val intent = Intent(holder.itemView.context, PeleaActivity::class.java) //ACTIVITY QUE QUIERO IR
           // intent.putExtra("POKEMON", lista[position].name) //PASAR EL DATO
           // holder.itemView.context.startActivity(intent) //INICIAR ACTIVITY
        }
    }


}