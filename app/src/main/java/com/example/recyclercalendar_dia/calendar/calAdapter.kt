package com.example.recyclercalendar_dia.calendar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclercalendar_dia.R
import kotlinx.android.synthetic.main.item_day.view.*

class calAdapter (val list : List<calModel>) : RecyclerView.Adapter<calViewHold>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): calViewHold {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_day,parent,false)
        return calViewHold(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: calViewHold, position: Int) {

        holder.containerView.textDay.text = list[position].text_day

    }
}