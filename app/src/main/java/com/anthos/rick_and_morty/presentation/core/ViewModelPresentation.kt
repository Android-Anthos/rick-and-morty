package com.anthos.rick_and_morty.presentation.core

import kotlinx.coroutines.flow.StateFlow
interface ViewModelPresentation<TUiEvent : UiEvent, TUiState : UiState> {
    fun processUiEvent(uiEvent: TUiEvent)
    fun uiStates(): StateFlow<TUiState>
}