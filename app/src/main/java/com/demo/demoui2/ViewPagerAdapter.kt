package com.demo.demoui2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


internal class ViewPagerAdapter() :
    RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {

    private val images = intArrayOf(
        R.drawable.design1,
        R.drawable.design2,
        R.drawable.design3,
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.vp_items, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
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

        init {
            images = itemView.findViewById(R.id.iv_vp)
        }
    }
}