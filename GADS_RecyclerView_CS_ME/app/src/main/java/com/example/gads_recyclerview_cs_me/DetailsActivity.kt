package com.example.gads_recyclerview_cs_me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gads_recyclerview_cs_me.databinding.ActivityDetailsBinding
import com.example.gads_recyclerview_cs_me.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val car = intent.getParcelableExtra<Car>("car")
        if (car != null) {
            binding.textView2.text = car.carName
            binding.imageView2.setImageResource(car.carImage)
        }
    }
}