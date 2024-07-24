package com.example.cards

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cards.databinding.ActivityCardBinding

class card : AppCompatActivity() {
    private lateinit var binding: ActivityCardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCardBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}