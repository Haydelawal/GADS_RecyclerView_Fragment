package com.example.gads_data_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gads_data_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //activity_main ==>> Activity_Main_Binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myUser = User("john", "Doe", 55, true)

        binding.user = myUser

        binding.textView.text = myUser.firstname
    }
}