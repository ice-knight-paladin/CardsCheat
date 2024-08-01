package com.example.cards

import android.media.Image
import android.view.View
import android.widget.ImageView
import java.io.Serializable

class ImageTry(private val image: View) : Serializable {
    fun get(): View = image
}