package com.example.mueddiswitze.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.mueddiswitze.R
import com.example.mueddiswitze.viewmodel.JokeViewModel

class JokeFragment : Fragment(R.layout.fragment_joke) {

    private val viewModel: JokeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.jokeResponse.observe(viewLifecycleOwner) { jokeResponse ->
            // Überprüfen, ob der Witz zweiteilig ist
            if (jokeResponse.type == "twopart") {
                view.findViewById<TextView>(R.id.tvSet).text = jokeResponse.setup
                view.findViewById<TextView>(R.id.tvDel).text = jokeResponse.delivery
            } else {
                view.findViewById<TextView>(R.id.tvSet).text = jokeResponse.setup
                view.findViewById<TextView>(R.id.tvDel).text = ""
            }
        }

        // Witz abrufen, wenn das Fragment erstellt wird
        viewModel.fetchJoke()

        // Button-Click-Listener für den nächsten Witz
        view.findViewById<Button>(R.id.btnNextJoke).setOnClickListener {
            viewModel.fetchJoke() // Lädt den nächsten Witz
        }
    }
}