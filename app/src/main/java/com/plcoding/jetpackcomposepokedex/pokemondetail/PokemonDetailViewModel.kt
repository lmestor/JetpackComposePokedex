package com.plcoding.jetpackcomposepokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.plcoding.jetpackcomposepokedex.data.remote.responses.Pokemon
import com.plcoding.jetpackcomposepokedex.data.remote.util.Resource
import com.plcoding.jetpackcomposepokedex.repository.PokemonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
): ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): com.plcoding.jetpackcomposepokedex.util.Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}