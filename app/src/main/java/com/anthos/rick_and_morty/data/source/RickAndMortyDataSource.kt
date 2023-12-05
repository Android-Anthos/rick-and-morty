package com.anthos.rick_and_morty.data.source

import com.anthos.rick_and_morty.data.remote.model.CharactersApiModel

interface RickAndMortyDataSource {
    suspend fun getCharacters(page: Int): CharactersApiModel
}