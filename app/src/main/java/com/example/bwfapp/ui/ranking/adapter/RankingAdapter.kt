package com.example.bwfapp.ui.ranking.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bwfapp.R

class RankingAdapter(private var ranking: MutableList<RankingItem>)
    : RecyclerView.Adapter<RankingAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val rank: TextView = view.findViewById(R.id.textRanking)
        val icon: ImageView = view.findViewById(R.id.imgPlayerIcon)
        val name: TextView = view.findViewById(R.id.textPlayerName)
        val associate: TextView = view.findViewById(R.id.textAssociates)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_ranking, parent, false)
        return  ViewHolder(view)
    }

    override fun getItemCount(): Int = ranking.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.rank.text = ranking[position].rank.toString()
        holder.icon.setImageBitmap(ranking[position].icon)
        holder.name.text = ranking[position].name
        holder.associate.text = ranking[position].association
    }
}