package com.example.mueddiswitze.model

class JokeResponse {

    // Datenklasse, die die Struktur der API-Antwort repräsentiert
    data class JokeResponse(
        val error: Boolean,
        val category: String,
        val type: String,
        val setup: String,
        val delivery: String,
        val flags: Map<String, Boolean>,
        val id: Int,
        val safe: Boolean,
        val lang: String
    )
}