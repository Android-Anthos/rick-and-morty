package com.anthos.rick_and_morty.presentation.repository

import com.anthos.rick_and_morty.presentation.characters.model.CharacterAttrs


interface RickAndMortyRepository {
    suspend fun getCharacters(page: Int): List<CharacterAttrs>
}
