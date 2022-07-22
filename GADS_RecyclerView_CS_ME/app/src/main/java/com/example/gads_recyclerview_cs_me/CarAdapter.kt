package com.example.gads_recyclerview_cs_me

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gads_recyclerview_cs_me.databinding.EachItemBinding
import com.example.gads_recyclerview_cs_me.databinding.RowLayoutBinding

class CarAdapter(private val carList: List<Car>): RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    var myOnItemClick : ((Car) -> Unit)? = null


    class CarViewHolder (val binding: EachItemBinding): RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder(EachItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }


    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val car = carList[position]
        holder.binding.imageView.setImageResource(car.carImage)
        holder.binding.textView.text = car.carName

        holder.itemView.setOnClickListener {
            myOnItemClick?.invoke(car)
        }
    }


    override fun getItemCount(): Int {
        return carList.size
    }



}