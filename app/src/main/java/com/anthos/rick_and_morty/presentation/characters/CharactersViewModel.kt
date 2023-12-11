package com.anthos.rick_and_morty.presentation.characters

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anthos.rick_and_morty.presentation.characters.CharactersUiEvent.InitialUiEvent
import com.anthos.rick_and_morty.presentation.characters.CharactersUiState.ErrorUiState
import com.anthos.rick_and_morty.presentation.characters.CharactersUiState.LoadCharactersUiState
import com.anthos.rick_and_morty.presentation.characters.CharactersUiState.ShowLoadingUiState
import com.anthos.rick_and_morty.presentation.core.ViewModelPresentation
import com.anthos.rick_and_morty.presentation.repository.RickAndMortyRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CharactersViewModel(private val repository: RickAndMortyRepository) : ViewModel(),
    ViewModelPresentation<CharactersUiEvent, CharactersUiState> {

    private val initialUiState: CharactersUiState = ShowLoadingUiState
    private val uiState = MutableStateFlow(initialUiState)

    override fun processUiEvent(uiEvent: CharactersUiEvent) {
        when (uiEvent) {
            is InitialUiEvent -> {
                getCharacters(page = 1)
            }
        }
    }

    private fun getCharacters(page: Int) {
        viewModelScope.launch {
            runCatching {
                repository.getCharacters(page = page)
            }.onSuccess { charactersAttrs ->
                uiState.update { LoadCharactersUiState(charactersAttrs) }
            }.onFailure {
                uiState.update { ErrorUiState }
            }
        }
    }

    override fun uiStates(): StateFlow<CharactersUiState> = uiState.asStateFlow()
}