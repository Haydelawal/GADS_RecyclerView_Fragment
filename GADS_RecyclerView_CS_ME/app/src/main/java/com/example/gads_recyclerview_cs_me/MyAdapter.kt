package com.example.gads_recyclerview_cs_me

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gads_recyclerview_cs_me.databinding.RowLayoutBinding


// Stevdza San Format
class MyAdapter: RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(val binding: RowLayoutBinding): RecyclerView.ViewHolder(binding.root)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(RowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.button.setOnClickListener {  }
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}