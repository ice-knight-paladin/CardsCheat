package com.example.cards

import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cards.a.KEY_COLODA
import com.example.cards.a.KEY_COLODAMAIN
import com.example.cards.a.KEY_V
import com.example.cards.databinding.ActivityDetalCardsBinding
import com.example.cards.databinding.ActivityMainBinding

class DetalCards : AppCompatActivity() {
    lateinit var arg: ImageTry
    lateinit var coloda: HashMap<ImageView, String>
    lateinit var binding: ActivityDetalCardsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalCardsBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        arg = intent.extras?.get(KEY_V) as ImageTry
//    }
//    //♠♥♦♣
//    public fun onClick(v: View) {
//        if (v.id == binding.bubna.id) {
//            if (coloda[arg.get()]?.contains("♠") == true){
//                coloda[arg.get()]!!.replace("♠", "")
//            } else if(coloda[arg.get()]?.contains("♥") == true){
//                coloda[arg.get()]!!.replace("♥", "")
//            }else if(coloda[arg.get()]?.contains("♦") == true){
//                coloda[arg.get()]!!.replace("♦", "")
//            }else if(coloda[arg.get()]?.contains("♣") == true){
//                coloda[arg.get()]!!.replace("♣", "")
//            }
//        }
//        for (i in coloda){
//            println(coloda[i as View])
//        }
  }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        outState.putSerializable(KEY_COLODA, coloda)
//    }
//
//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState)
//        coloda = savedInstanceState.getSerializable(KEY_COLODAMAIN) as HashMap<ImageView, String>
//    }
}