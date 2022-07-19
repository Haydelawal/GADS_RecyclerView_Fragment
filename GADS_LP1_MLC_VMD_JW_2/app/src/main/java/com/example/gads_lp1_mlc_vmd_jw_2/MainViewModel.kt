package com.example.gads_lp1_mlc_vmd_jw_2

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel(name: String): ViewModel() {

    var myName = name

    init {
        Log.d("ViewModel", "AAAA $myName")
    }



}