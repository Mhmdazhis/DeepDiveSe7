package com.azis.deepdivese7.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.azis.deepdivese7.R

class Horizontal_RecyclerView: RecyclerView.Adapter<Horizontal_RecyclerView.MyViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_data,  parent, false)
        return MyViewHolder(view)
    }



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 25
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

    }
}