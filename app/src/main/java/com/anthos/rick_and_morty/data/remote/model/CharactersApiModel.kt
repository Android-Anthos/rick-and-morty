package com.anthos.rick_and_morty.data.remote.model

import com.anthos.rick_and_morty.data.remote.model.Constants.INFO
import com.anthos.rick_and_morty.data.remote.model.Constants.RESULTS
import com.google.gson.annotations.SerializedName

data class CharactersApiModel(
    @SerializedName(RESULTS) val results: List<CharacterApiModel?>?,
    @SerializedName(INFO) val info: InfoApiModel?
)