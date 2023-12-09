package com.example.mueddiswitze.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mueddiswitze.model.JokeResponse
import com.example.mueddiswitze.repository.JokeRepository
import kotlinx.coroutines.launch

class JokeViewModel : ViewModel() {
    val jokeResponse: MutableLiveData<JokeResponse> = MutableLiveData()
    private val repository = JokeRepository()

    fun fetchJoke() {
        // Coroutine verwenden, um die suspendierte Funktion aufzurufen
        viewModelScope.launch {
            try {
                val response = repository.getJoke()
                jokeResponse.postValue(response) // LiveData aktualisieren
            } catch (e: Exception) {
                // Fehlerbehandlung
            }
        }
    }
}