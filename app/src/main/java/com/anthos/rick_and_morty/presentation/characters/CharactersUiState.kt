package com.anthos.rick_and_morty.presentation.characters

import com.anthos.rick_and_morty.presentation.characters.core.UiState

sealed class CharactersUiState : UiState {
    object ShowLoadingUiState : CharactersUiState()
    data class LoadCharactersUiState(val charactersAttrs: List<CharacterAttrs>) :
        CharactersUiState()
    object ErrorUiState : CharactersUiState()
}