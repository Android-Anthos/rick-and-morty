package com.anthos.rick_and_morty.factory

import com.anthos.rick_and_morty.data.remote.model.CharacterApiModel
import com.anthos.rick_and_morty.data.remote.model.CharactersApiModel
import com.anthos.rick_and_morty.data.remote.model.InfoApiModel
import com.anthos.rick_and_morty.data.remote.model.LocationApiModel
import com.anthos.rick_and_morty.data.remote.model.OriginApiModel
import com.anthos.rick_and_morty.factory.RandomFactory.generateInt
import com.anthos.rick_and_morty.factory.RandomFactory.generateString

object RickAndMortyFactory {

    fun makeCharactersApiModelResponse() = CharactersApiModel(
        info = makeInfoApiModel(),
        results = makeSuccessCharacterListApiModel(3)
    )

    private fun makeInfoApiModel() = InfoApiModel(
        count = generateInt(),
        pages = generateInt(),
        next = generateString(),
        prev = generateString()
    )

    private fun makeSuccessCharacterListApiModel(count: Int) = (1..count).map { makeSuccessCharacterApiModel() }

    private fun makeSuccessCharacterApiModel() = CharacterApiModel(
        id = generateInt(),
        name = generateString(),
        species = generateString(),
        gender = generateString(),
        image = generateString(),
        origin = makeOriginApiModel(),
        status = generateString(),
        type = generateString(),
        location = makeLocationApiModel(),
        episode = makeEpisodeListApiModel(3),
        url = generateString(),
        created = generateString()
    )

    private fun makeOriginApiModel() = OriginApiModel(
        name = generateString(),
        url = generateString()
    )

    private fun makeLocationApiModel() = LocationApiModel(
        name = generateString(),
        url = generateString()
    )

    private fun makeEpisodeListApiModel(count: Int) = (1..count).map { generateString() }
}