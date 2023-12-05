package com.anthos.rick_and_morty.data.remote.api

import com.anthos.rick_and_morty.data.remote.model.CharactersApiModel
import com.anthos.rick_and_morty.data.remote.model.Constants.PAGE
import retrofit2.http.GET
import retrofit2.http.Query

interface RickAndMortyApi {
    @GET("character")
    suspend fun getCharacters(@Query(PAGE) page: Int): CharactersApiModel
}