package com.anthos.rick_and_morty.data.remote.api.config

object UrlProvider {
    private const val BASE_URL = "https://rickandmortyapi.com/api/"
    fun getRickAndMortyUrl() = BASE_URL

}