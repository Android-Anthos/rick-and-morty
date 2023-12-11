package com.anthos.rick_and_morty.presentation.characters

import com.anthos.rick_and_morty.presentation.core.UiState
import com.anthos.rick_and_morty.presentation.characters.model.CharacterAttrs

sealed class CharactersUiState : UiState {
    object ShowLoadingUiState : CharactersUiState()
    data class LoadCharactersUiState(val charactersAttrs: List<CharacterAttrs>) :
        CharactersUiState()
    object ErrorUiState : CharactersUiState()
}