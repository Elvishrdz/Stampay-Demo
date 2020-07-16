package com.eahm.stampaydemo.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.eahm.stampaydemo.R
import com.eahm.stampaydemo.models.Campaing
import java.util.zip.Inflater

class RecyclerViewAdapter(
    private val content : List<Campaing>,
    private val context : Context
) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private lateinit var rootView : View

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        rootView = LayoutInflater.from(parent.context).inflate(R.layout.item_campaing, parent, false)
        return ViewHolder(rootView)
    }

    override fun getItemCount(): Int {
        return content.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(content[position])
        if(content[position].photoUrl.isNotEmpty()){
            Glide.with(rootView)
                .load(content[position].photoUrl)
                .into(holder.photo)
        }

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val item : CardView = itemView.findViewById(R.id.cardCampaing)
        val photo : ImageView = itemView.findViewById(R.id.ivCampaingImage)
        private val title : TextView = itemView.findViewById(R.id.tvCampaingTitle)
        private val subtitle : TextView = itemView.findViewById(R.id.tvCampaingSubtitle)
        private val stars : TextView = itemView.findViewById(R.id.tvCampaingStars)
        private val gift : TextView = itemView.findViewById(R.id.tvCampaingGift)

        @SuppressLint("SetTextI18n")
        fun bind(campaing: Campaing){
            title.text = campaing.title
            subtitle.text = campaing.subtitle
            stars.text = "${campaing.starsCurrent}/${campaing.starsTotal}"
            gift.text = "${campaing.giftAmount}"

            item.setOnClickListener{
                Toast.makeText(context, "Show details from ${campaing.title}", Toast.LENGTH_SHORT).show()
            }

        }

    }

}