package com.example.cards

import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.cards.databinding.ActivityMainBinding
import com.example.cards.databinding.ImageItemBinding

class MyItemsAdapter : RecyclerView.Adapter<MyItemViewHolder>() {
    private val itemList = ArrayList<ImageView>()

    fun add(imageView: ImageView) {
        itemList.add(imageView)
        notifyItemInserted(itemCount - 1)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyItemViewHolder {
        return MyItemViewHolder(ImageItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: MyItemViewHolder, position: Int) {
        holder.bind(itemList[position])
    }
}

class MyItemViewHolder(private val binding: ImageItemBinding) : ViewHolder(binding.root) {
    fun bind(source: ImageView) {
        binding.element.setImageDrawable(source.drawable)
    }
}