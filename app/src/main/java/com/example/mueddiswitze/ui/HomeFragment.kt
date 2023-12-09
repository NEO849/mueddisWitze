package com.example.mueddiswitze.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mueddiswitze.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnWitze).setOnClickListener {
            // Navigation zum JokeFragment ausführen
            findNavController().navigate(R.id.action_homeFragment_to_jokeFragment)
        }
    }
}