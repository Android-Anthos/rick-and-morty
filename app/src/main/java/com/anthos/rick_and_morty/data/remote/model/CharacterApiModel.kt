package com.anthos.rick_and_morty.data.remote.model

import com.anthos.rick_and_morty.data.remote.model.Constants.GENDER
import com.anthos.rick_and_morty.data.remote.model.Constants.ID
import com.anthos.rick_and_morty.data.remote.model.Constants.IMAGE
import com.anthos.rick_and_morty.data.remote.model.Constants.NAME
import com.anthos.rick_and_morty.data.remote.model.Constants.ORIGIN
import com.anthos.rick_and_morty.data.remote.model.Constants.SPECIES
import com.google.gson.annotations.SerializedName

data class CharacterApiModel(
    @SerializedName(ID) val id: Int?,
    @SerializedName(NAME) val name: String?,
    @SerializedName(SPECIES) val species: String?,
    @SerializedName(GENDER) val gender: String?,
    @SerializedName(IMAGE) val image: String?,
    @SerializedName(ORIGIN) val origin: OriginApiModel?
)