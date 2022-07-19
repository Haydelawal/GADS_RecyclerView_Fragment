package com.example.gads_lp1_mlc_vmd_jw_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.gads_lp1_mlc_vmd_jw_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //activity_main ==>> Activity_Main_Binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModelFactory = MainViewModelFactory("Woo 1")
        var viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        binding.text.text = viewModel.myName.toString()
    }
}