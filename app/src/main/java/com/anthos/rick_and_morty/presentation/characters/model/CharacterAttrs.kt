package com.anthos.rick_and_morty.presentation.characters.model

data class CharacterAttrs(
    val id: Int,
    val name: String,
    val species: String,
    val gender: String,
    val image: String,
    val origin: OriginAttrs,
    val status: String,
    val type: String,
    val location: LocationAttrs,
    val episode: List<String>,
    val url: String,
    val created: String,
)