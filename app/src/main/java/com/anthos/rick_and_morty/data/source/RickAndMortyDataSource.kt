package com.anthos.rick_and_morty.data.source

import com.anthos.rick_and_morty.data.remote.model.CharacterApiModel

interface RickAndMortyDataSource {
    suspend fun getCharacterDetails(id: Int): CharacterApiModel
}