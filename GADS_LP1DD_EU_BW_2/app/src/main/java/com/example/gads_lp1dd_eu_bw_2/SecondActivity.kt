package com.example.gads_lp1dd_eu_bw_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gads_lp1dd_eu_bw_2.databinding.ActivityMainBinding
import com.example.gads_lp1dd_eu_bw_2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    //activity_main ==>> Activity_Main_Binding
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}