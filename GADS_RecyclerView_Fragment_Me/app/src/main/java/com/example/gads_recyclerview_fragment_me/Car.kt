package com.example.gads_recyclerview_cs_me

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// Original
//data class Car(val carImage: Int, val carName: String)

@Parcelize
data class Car(val carImage: Int, val carName: String) : Parcelable