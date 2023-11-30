package com.anthos.rick_and_morty.data.remote.api

import com.anthos.rick_and_morty.data.remote.model.CharacterApiModel
import com.anthos.rick_and_morty.data.remote.model.Constants.ID
import retrofit2.http.GET
import retrofit2.http.Path

interface RickAndMortyApi {

    @GET("character/{id}")
    suspend fun getCharacterDetails(@Path(ID) id: Int): CharacterApiModel
}