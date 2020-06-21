package com.example.picasso

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class Item(var versionList: ArrayList<List>): RecyclerView.Adapter<Item.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Item.ViewHolder {
        var view: View = LayoutInflater.from(parent.context).inflate(R.layout.cardview, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = versionList.size

    override fun onBindViewHolder(holder: Item.ViewHolder, position: Int) {
        holder.bindItems(versionList[position])
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(version : List){
            val imageView = itemView.findViewById<ImageView>(R.id.imageview)
            Picasso.get().load(version.imageURL).into(imageView)
        }
    }

}