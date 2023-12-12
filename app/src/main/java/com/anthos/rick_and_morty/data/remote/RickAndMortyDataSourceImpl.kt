package com.anthos.rick_and_morty.data.remote

import com.anthos.rick_and_morty.data.remote.api.RickAndMortyApi
import com.anthos.rick_and_morty.data.remote.model.CharactersApiModel
import com.anthos.rick_and_morty.data.source.RickAndMortyDataSource

class RickAndMortyDataSourceImpl constructor(private val api: RickAndMortyApi) :
    RickAndMortyDataSource {

    override suspend fun getCharacters(page: Int): CharactersApiModel {
        val response = api.getCharacters(page)

        if (response != null) {
            return response
        } else {
            throw Exception("CharactersApiModel is null")
        }
    }
}
