package com.example.cards

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cards.a.KEY_COLODAMAIN
import com.example.cards.a.KEY_V
import com.example.cards.a.SHOW
import com.example.cards.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //private var abracadabra = listOf<String>("♠","♥", "♦", "♣")

    private lateinit var binding: ActivityMainBinding

    var coloda = HashMap<Int, String>()
    var hash: CardModel = CardModel(coloda)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var images = mutableListOf<ImageView>()


        val image2 = binding.image2
        images.add(image2)
        val image3 = binding.image3
        images.add(image3)
        val image4 = binding.image4
        images.add(image4)
        val image5 = binding.image5
        images.add(image5)
        val image6 = binding.image6
        images.add(image6)
        val image7 = binding.image7
        images.add(image7)
        val image8 = binding.image8
        images.add(image8)
        val image9 = binding.image9
        images.add(image9)
        val image10 = binding.image10
        images.add(image10)
        val imageJ = binding.imageJ
        images.add(imageJ)
        val imageQ = binding.imageQ
        images.add(imageQ)
        val imageK = binding.imageK
        images.add(imageK)
        val imageA = binding.imageA
        images.add(imageA)
        val imageJOKER = binding.imageJOKER
        images.add(imageJOKER)
        if (intent.extras?.getSerializable(KEY_COLODAMAIN) == null) {
            if (coloda.isEmpty()) {
                for (i in images) {
                    hash.intel(i.id)
                }
            }
        }else hash = intent.extras?.getSerializable(KEY_COLODAMAIN) as CardModel

        binding.sbros.setOnClickListener{
            hash.update(true)
        }

        binding.vvod.setOnClickListener{
            hash.update(false)
        }

        binding.show.setOnClickListener{
            if (hash.isclearpar()){
                val intent = Intent(this, ShowColoda::class.java)
                intent.putExtra(SHOW, hash)
                startActivity(intent)
                finish()
            }
            else Toast.makeText(this, "Ввод или сборс?", Toast.LENGTH_SHORT).show()
        }
    }

    public fun onClick(v: View) {
//        hash.printall()
        if (v.javaClass.toString() == "class androidx.appcompat.widget.AppCompatImageView") {
            val intent = Intent(this, DetalCards::class.java)
            intent.putExtra(CardModel::class.simpleName, hash)
            intent.putExtra(KEY_V, v.id)
            startActivity(intent)
            finish()
        }
    }


}