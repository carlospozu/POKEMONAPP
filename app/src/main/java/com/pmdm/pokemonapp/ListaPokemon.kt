
/*class ListaPokemon(var listaPokemon : MutableList<Pokemon> = mutableListOf()) :
    MutableList<Pokemon> {



    fun agregar(pokemon: Pokemon) {
        listaPokemon.add(pokemon)
    }

    fun imprimirPokemons(){
        if (listaPokemon.isEmpty()) {
            println("No se ha encontrado a ese Pokémon")
        } else {
            listaPokemon.forEach {
                println(it.decirNombreYTipo())
            }
        }
    }

    fun buscarPokemonPorNombre(nombreBuscado : String) : ListaPokemon {
        // TODO muéstrame al Pokemon que las letras buscadas incluidas en su nombre. Si no hay, dime que no hay
        val listaFiltrada = listaPokemon.filter {
            it.name.contains(nombreBuscado)
        }

        return ListaPokemon(listaFiltrada.toMutableList())
    }

    fun buscarPokemonPorTipo(tipoBuscado : String) : ListaPokemon {
        // TODO muéstrame todos los pokemon de ese tipo. Si no hay, dime que no hay

        val listaFiltrada = listaPokemon.filter { pokemon ->
            var encontrado = false
            pokemon.types.forEach {  tipo ->
                if (tipo.type.name == tipoBuscado)
                    encontrado = true
            }
            encontrado
        }

        return ListaPokemon(listaFiltrada.toMutableList())
    }


}*/