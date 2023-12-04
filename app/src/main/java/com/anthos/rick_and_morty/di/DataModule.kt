package com.anthos.rick_and_morty.di

import com.anthos.rick_and_morty.data.remote.api.RickAndMortyApi
import com.anthos.rick_and_morty.data.remote.api.config.UrlProvider.getRickAndMortyUrl
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object DataModule {
    private val provideRickAndMortyApi:RickAndMortyApi by lazy {
        val baseUrl = getRickAndMortyUrl()
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create()

    }
}