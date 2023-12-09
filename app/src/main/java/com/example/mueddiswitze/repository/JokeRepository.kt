package com.example.mueddiswitze.repository

import com.example.mueddiswitze.model.JokeResponse
import com.example.mueddiswitze.network.JokeApiService

// Repository, das die Logik für den Netzwerkaufruf enthält
class JokeRepository {
    private val apiService = JokeApiService.create()

    suspend fun getJoke(): JokeResponse {
        // Code zum Aufrufen der Joke API
        val response = apiService.getJoke()
        // Rückgabe der Antwort
        return response
    }
}