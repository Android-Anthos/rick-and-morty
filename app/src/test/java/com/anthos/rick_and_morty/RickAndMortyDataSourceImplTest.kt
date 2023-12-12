package com.anthos.rick_and_morty.data.remote

import com.anthos.rick_and_morty.data.remote.api.RickAndMortyApi
import com.anthos.rick_and_morty.data.remote.model.CharactersApiModel
import com.anthos.rick_and_morty.factory.RickAndMortyFactory.makeCharactersApiModelResponse
import kotlinx.coroutines.runBlocking
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`
import kotlin.test.Test
import kotlin.test.assertEquals


class RickAndMortyDataSourceImplTest {

    private val mockApi = mock(RickAndMortyApi::class.java)
    private val sutRemoteDataSource = RickAndMortyDataSourceImpl(api = mockApi)

    @Test
    fun `given getCharacters, when page equals 1, then call api getCharacters`() =
        runBlocking<Unit> {
            val page = 1
            val charactersApiModel = makeCharactersApiModelResponse()
            stubGetCharacters(page, charactersApiModel)

            sutRemoteDataSource.getCharacters(page)

            verify(mockApi).getCharacters(page)
        }

    @Test
    fun `given getCharacters, when page is a number, then api return CharactersApiModel not null`() =
        runBlocking {

            // Given
            val page = 10
            val charactersApiModel = makeCharactersApiModelResponse()
            stubGetCharacters(page, charactersApiModel)

            // When
            val result = sutRemoteDataSource.getCharacters(page)

            // Then
            assertEquals(charactersApiModel, result)
        }

    @Test
    fun `given getCharacters, when page is a number, then api return CharactersApiModel info next not null`() =
        runBlocking {

            // Given
            val page = 10
            val charactersApiModel = makeCharactersApiModelResponse()
            stubGetCharacters(page, charactersApiModel)

            // When
            val result = sutRemoteDataSource.getCharacters(page)

            // Then
            assertEquals(charactersApiModel.info?.next, result.info?.next)
        }

    @Test(expected = Exception::class)
    fun `given getCharacters, when page is a number, then api throw an Exception`() =
        runBlocking<Unit> {

            // Given
            val page = 10
            stubGetCharactersError()

            // When
            sutRemoteDataSource.getCharacters(page)

            verify(mockApi).getCharacters(page)
        }

    private fun stubGetCharacters(
        page: Int,
        response: CharactersApiModel,
    ) = runBlocking {
        `when`(mockApi.getCharacters(page)).thenReturn(response)
    }

    private fun stubGetCharactersError() = runBlocking {
        `when`(mockApi.getCharacters(1)).thenReturn(null)
    }
}