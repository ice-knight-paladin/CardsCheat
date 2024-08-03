package com.example.cards

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cards.a.SHOW
import com.example.cards.databinding.ActivityMainBinding
import com.example.cards.databinding.ActivityShowColodaBinding

class ShowColoda : AppCompatActivity() {
    private lateinit var binding: ActivityShowColodaBinding

    lateinit var coloda_hash: HashMap<Int, String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowColodaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        coloda_hash = (intent.extras!!.getSerializable(SHOW) as CardModel).getcoloda()
        val myItemsAdapterbubna = MyItemsAdapter()
        val myItemsAdapterpici = MyItemsAdapter()
        val myItemsAdaptercresti = MyItemsAdapter()
        val myItemsAdapterchervi = MyItemsAdapter()

        binding.recyclerbubna.adapter = myItemsAdapterbubna
        binding.recyclerpiki.adapter = myItemsAdapterpici
        binding.recyclerchervi.adapter = myItemsAdapterchervi
        binding.recyclercresti.adapter = myItemsAdaptercresti

        for (i in coloda_hash.keys) {
            if (coloda_hash[i]!!.contains("♦")){
                myItemsAdapterbubna.add(cheakId_main(i))
            }
            if (coloda_hash[i]!!.contains("♥")){
                myItemsAdapterchervi.add(cheakId_main(i))
            }
            if (coloda_hash[i]!!.contains("♠")){
                myItemsAdaptercresti.add(cheakId_main(i))
            }
            if (coloda_hash[i]!!.contains("♣")){
                myItemsAdapterpici.add(cheakId_main(i))
            }
        }
    }


    fun cheakId_main(id: Int): ImageView {
        val bind = ActivityMainBinding.inflate(layoutInflater)

        if (bind.image2.id == id) {
            return bind.image2
        } else if (bind.image3.id == id) {
            return bind.image3
        } else if (bind.image4.id == id) {
            return bind.image4
        } else if (bind.image5.id == id) {
            return bind.image5
        } else if (bind.image6.id == id) {
            return bind.image6
        } else if (bind.image7.id == id) {
            return bind.image7
        } else if (bind.image8.id == id) {
            return bind.image8
        } else if (bind.image9.id == id) {
            return bind.image9
        } else if (bind.image10.id == id) {
            return bind.image10
        } else if (bind.imageJ.id == id) {
            return bind.imageJ
        } else if (bind.imageQ.id == id) {
            return bind.imageQ
        } else if (bind.imageK.id == id) {
            return bind.imageK
        } else if (bind.imageA.id == id) {
            return bind.imageA
        } else {
            return bind.imageJOKER
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}