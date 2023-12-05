package com.anthos.rick_and_morty.presentation.characters

import com.anthos.rick_and_morty.presentation.characters.core.UiEvent

sealed class CharactersUiEvent: UiEvent {
    object InitialUiEvent : CharactersUiEvent()
}