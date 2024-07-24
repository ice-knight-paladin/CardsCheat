package com.example.cards

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cards.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val abracadabra = listOf<String>("♠","♥", "♦", "♣")
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun cherviClick(view: View) {}
    fun crestiClick(view: View) {}
    fun bubnaClick(view: View) {}
    fun piciClick(view: View) {}
}