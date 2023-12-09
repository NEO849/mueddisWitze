package com.example.mueddiswitze.model

data class JokeResponse(
    val error: Boolean,
    val category: String,
    val type: String,
    val setup: String?,
    val delivery: String?,
    val flags: Map<String, Boolean>,
    val id: Int,
    val safe: Boolean,
    val lang: String)