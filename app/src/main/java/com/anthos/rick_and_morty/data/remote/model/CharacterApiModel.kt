package com.anthos.rick_and_morty.data.remote.model

import com.anthos.rick_and_morty.data.remote.model.Constants.CREATED
import com.anthos.rick_and_morty.data.remote.model.Constants.EPISODE
import com.anthos.rick_and_morty.data.remote.model.Constants.GENDER
import com.anthos.rick_and_morty.data.remote.model.Constants.ID
import com.anthos.rick_and_morty.data.remote.model.Constants.IMAGE
import com.anthos.rick_and_morty.data.remote.model.Constants.LOCATION
import com.anthos.rick_and_morty.data.remote.model.Constants.NAME
import com.anthos.rick_and_morty.data.remote.model.Constants.ORIGIN
import com.anthos.rick_and_morty.data.remote.model.Constants.SPECIES
import com.anthos.rick_and_morty.data.remote.model.Constants.STATUS
import com.anthos.rick_and_morty.data.remote.model.Constants.TYPE
import com.anthos.rick_and_morty.data.remote.model.Constants.URL
import com.google.gson.annotations.SerializedName

data class CharacterApiModel (
    @SerializedName(ID) val id: Int?,
    @SerializedName(NAME) val name: String?,
    @SerializedName(SPECIES) val species: String?,
    @SerializedName(GENDER) val gender: String?,
    @SerializedName(IMAGE) val image: String?,
    @SerializedName(ORIGIN) val origin: OriginApiModel?,
    @SerializedName(STATUS) val status: String?,
    @SerializedName(TYPE) val type: String?,
    @SerializedName(LOCATION) val location: LocationApiModel?,
    @SerializedName(EPISODE) val episode: List<String?>?,
    @SerializedName(URL) val url: String?,
    @SerializedName(CREATED) val created: String?,
)