package com.example.cards

import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cards.a.KEY_COLODAMAIN
import com.example.cards.a.KEY_V
import com.example.cards.databinding.ActivityDetalCardsBinding
import com.example.cards.databinding.ActivityMainBinding

class DetalCards : AppCompatActivity() {
    lateinit var coloda_hash: CardModel
    lateinit var binding: ActivityDetalCardsBinding
    private var arg: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalCardsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        coloda_hash = intent.extras!!.getSerializable(CardModel::class.simpleName) as CardModel
        arg = intent.extras!!.getInt(KEY_V)
    }

    //♠♥♦♣
    public fun onClick(v: View) {
//        val bind = ActivityMainBinding.inflate(layoutInflater)
        if (v.id == binding.bubna.id) {
            if (coloda_hash.delete(arg, "♦")) {
                nextActivity()
            } else {
                Toast.makeText(this, "Daun, такой уже ушел", Toast.LENGTH_SHORT).show()
            }
        } else if (v.id == binding.chervi.id) {
            if (coloda_hash.delete(arg, "♥")) {
                nextActivity()
            } else {
                Toast.makeText(this, "Daun, такой уже ушел", Toast.LENGTH_SHORT).show()
            }
        } else if (v.id == binding.cresti.id) {
            if (coloda_hash.delete(arg, "♠")) {
                nextActivity()
            } else {
                Toast.makeText(this, "Daun, такой уже ушел", Toast.LENGTH_SHORT).show()
            }
        } else {
            if (coloda_hash.delete(arg, "♣")) {
                nextActivity()
            } else {
                Toast.makeText(this, "Daun, такой уже ушел", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun nextActivity(){
        Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra(KEY_COLODAMAIN, coloda_hash)
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
//    fun cheakId(id: Int): ImageView {
//        val bind = ActivityMainBinding.inflate(layoutInflater)
//
//        if (bind.image2.id == id) {
//            return bind.image2
//        } else if (bind.image3.id == id) {
//            return bind.image3
//        } else if (bind.image4.id == id) {
//            return bind.image4
//        } else if (bind.image5.id == id) {
//            return bind.image5
//        } else if (bind.image6.id == id) {
//            return bind.image6
//        } else if (bind.image7.id == id) {
//            return bind.image7
//        } else if (bind.image8.id == id) {
//            return bind.image8
//        } else if (bind.image9.id == id) {
//            return bind.image9
//        } else if (bind.image10.id == id) {
//            return bind.image10
//        } else if (bind.imageJ.id == id) {
//            return bind.imageJ
//        } else if (bind.imageQ.id == id) {
//            return bind.imageQ
//        } else if (bind.imageK.id == id) {
//            return bind.imageK
//        } else if (bind.imageA.id == id) {
//            return bind.imageA
//        } else {
//            return bind.imageJOKER
//        }
}