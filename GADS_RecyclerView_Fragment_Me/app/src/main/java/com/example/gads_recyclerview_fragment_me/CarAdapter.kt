package com.example.gads_recyclerview_fragment_me

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.gads_recyclerview_cs_me.Car
import com.example.gads_recyclerview_fragment_me.databinding.EachItemBinding
import kotlin.coroutines.coroutineContext

class CarAdapter(
    private val carList: List<Car>,
    private val listener: ClickListener
): RecyclerView.Adapter<CarAdapter.CarViewHolder>() {


    class CarViewHolder (val binding: EachItemBinding): RecyclerView.ViewHolder(binding.root){

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder(EachItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }


    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {


        val position = position
        val car = carList[position]
        holder.binding.imageView.setImageResource(car.carImage)
        holder.binding.textView.text = car.carName


        holder.itemView.setOnClickListener {

            listener.onCardClick(car)
        }


        
    }


    override fun getItemCount(): Int {
        return carList.size
    }

    interface ClickListener {
        fun onCardClick(car: Car)
    }

}