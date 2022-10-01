package com.demo.demoui2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecyclerAdapter2() : RecyclerView.Adapter<RecyclerAdapter2.ViewHolder>() {

    private val images = intArrayOf(
        R.drawable.construction,
        R.drawable.furniture,
        R.drawable.fitout,
        R.drawable.construction,
        R.drawable.furniture,
        R.drawable.fitout
    )

    private val titles = arrayOf(
        "Construction",
        "Furniture",
        "Fitout",
        "Construction",
        "Furniture",
        "Fitout"
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.rv_product_cat, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = titles[position].toString()
        Glide
            .with(holder.itemView.context)
            .load(images[position])
            .centerCrop()
            .into(holder.images)
    }

    override fun getItemCount(): Int {
        return images.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var images: ImageView
        var title: TextView

        init {
            images = itemView.findViewById(R.id.iv_products)
            title = itemView.findViewById(R.id.tv_product_cat)
        }
    }
}