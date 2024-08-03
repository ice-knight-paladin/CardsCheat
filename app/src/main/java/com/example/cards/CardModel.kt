package com.example.cards

import android.content.Intent
import android.widget.ImageView
import java.io.Serializable

class CardModel(private val coloda: HashMap<Int, String>) : Serializable {
    private var par = HashMap<Int, String>()
    fun intel(imageView: Int) {
        coloda[imageView] = "♠♥♦♣"
        par[imageView] = ""
    }

    fun delete(imageView: Int, string: String): Boolean {
        if (coloda[imageView]!!.contains(string)) {
            coloda[imageView] = coloda[imageView]!!.replace(string, "")
            par[imageView] = string + par[imageView]
            return true
        }
        return false
    }

    fun update(sbros: Boolean) {
        if (sbros) {
            for (i in par.keys) {
                par[i] = ""
            }
        } else {
            for (i in par.keys) {
                coloda[i] = coloda[i] + par[i]
            }
        }
    }

    fun getcoloda(): HashMap<Int, String> = coloda

    fun printall() {
        for (i in coloda.keys) {
            println("$i : ${coloda[i]}")
        }
    }
}