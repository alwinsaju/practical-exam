package com.als1921008.pracexam.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.als1921008.pracexam.R
import com.als1921008.pracexam.model.Res

class RVadapter (private val dataSet : List<Res>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val nameTV = itemView.findViewById<TextView>(R.id.txtView_name)
        val addressTV = itemView.findViewById<TextView>(R.id.txtView_address)
        val specialityTV = itemView.findViewById<TextView>(R.id.txtView_speciality)
        val ratingTV = itemView.findViewById<TextView>(R.id.txtView_rating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).
        inflate(R.layout.xyz, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val res = dataSet[position]
        val viewHolder = holder as ViewHolder
        viewHolder.nameTV.text = res.name
        viewHolder.addressTV.text = res.address
        viewHolder.specialityTV.text = res.speciality
        viewHolder.ratingTV.text = res.rating
    }
    override fun getItemCount() = dataSet.size
}