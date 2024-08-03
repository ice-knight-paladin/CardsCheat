package com.example.cards

import android.widget.ImageView
import java.io.Serializable

class CardModel(private val coloda: HashMap<Int, String>) : Serializable {
    private var par = HashMap<Int, String>()
    fun intel(imageView: Int) {
        coloda[imageView] = "♠♥♦♣"
        par[imageView] = ""
    }

    fun delete(imageView: Int, string: String) : Boolean{
        if (coloda[imageView]!!.contains(string)){
            coloda[imageView] = coloda[imageView]!!.replace(string, "")
            par[imageView] =string + par[imageView]
            return true
        }
        return false
    }

    fun update(sbros:Boolean){

    }
}