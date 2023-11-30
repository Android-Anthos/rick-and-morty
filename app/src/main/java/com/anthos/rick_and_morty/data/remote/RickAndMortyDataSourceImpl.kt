package com.anthos.rick_and_morty.data.remote

import com.anthos.rick_and_morty.data.remote.api.RickAndMortyApi
import com.anthos.rick_and_morty.data.remote.model.CharacterApiModel
import com.anthos.rick_and_morty.data.source.RickAndMortyDataSource

class RickAndMortyDataSourceImpl constructor(private val api: RickAndMortyApi) :
    RickAndMortyDataSource {
    override suspend fun getCharacterDetails(id: Int): CharacterApiModel {
        return api.getCharacterDetails(id)
    }


}