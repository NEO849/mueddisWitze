package com.example.mueddiswitze.network

import com.example.mueddiswitze.model.JokeResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface JokeApiService {
    @GET("joke/Any?lang=de")
    suspend fun getJoke(): JokeResponse

    companion object {
        fun create(): JokeApiService {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://v2.jokeapi.dev/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(JokeApiService::class.java)
        }
    }
}