package com.anthos.rick_and_morty.data.remote.model

import com.anthos.rick_and_morty.data.remote.model.Constants.NAME
import com.anthos.rick_and_morty.data.remote.model.Constants.URL
import com.google.gson.annotations.SerializedName

data class OriginApiModel(
    @SerializedName(NAME) val name: String?,
    @SerializedName(URL) val url: String?
)