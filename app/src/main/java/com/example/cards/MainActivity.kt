package com.example.cards

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import com.example.cards.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val abracadabra = listOf<String>("♠","♥", "♦", "♣")
    private val viewModel: MainViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image2 = binding.image2
        val image3 = binding.image3
        val image4 = binding.image4
        val image5 = binding.image5
        val image6 = binding.image6
        val image7 = binding.image7
        val image8 = binding.image8
        val image9 = binding.image9
        val image10 = binding.image10
        val imageJ = binding.imageJ
        val imageQ = binding.imageQ
        val imageK = binding.imageK
        val imageA = binding.imageA
        val imageJOKER = binding.imageJOKER


        image2.setOnClickListener{
            val card = CardModel(2, R.drawable.two)
            viewModel.selectCard(card)
            startActivity(Intent(this, DetalCards::class.java))
        }

        viewModel.selectedCards.observe(this, Observer {

        })
    }
}