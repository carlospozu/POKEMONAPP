import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request
/*
class ObtenerPokemonRequest {

    companion object {
        var gson = Gson()
        fun get(): Any {
            var listaPokemon = mutableListOf<Pokemon>()
            val client = OkHttpClient()
            for (i in 1..9) {
                val request = Request.Builder()
                    request.url("https://pokeapi.co/api/v2/pokemon/${i}")
                val response = client.newCall(request.build())


                if (response.isSuccessful) {
                    response.body?.string().let { responseBody ->
                        val pokemon = gson.fromJson(responseBody, Pokemon::class.java)
                        listaPokemon.add(pokemon)
                    }

                } else
                    println("Algo ha ido mal")
            }
            return listaPokemon
        }
    }

}*/