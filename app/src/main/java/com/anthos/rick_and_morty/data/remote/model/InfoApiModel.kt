package com.anthos.rick_and_morty.data.remote.model

import com.anthos.rick_and_morty.data.remote.model.Constants.COUNT
import com.anthos.rick_and_morty.data.remote.model.Constants.NEXT
import com.anthos.rick_and_morty.data.remote.model.Constants.PAGES
import com.anthos.rick_and_morty.data.remote.model.Constants.PREV
import com.google.gson.annotations.SerializedName

data class InfoApiModel(
    @SerializedName(COUNT) val count: Int?,
    @SerializedName(PAGES) val pages: Int?,
    @SerializedName(NEXT) val next: String?,
    @SerializedName(PREV) val prev: String?
)
