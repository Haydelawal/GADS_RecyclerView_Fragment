package com.example.gads_lp1_mlc_vmd_jw_2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")

class MainViewModelFactory(private var name: String): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(name) as T
        }
        throw IllegalAccessException("ViewModel Class Not Found")
    }
}