package com.example.gads_recyclerview_cs_me

import android.os.Parcel
import android.os.Parcelable

// Original
//data class Car(val carImage: Int, val carName: String)

// Added Parcelable and implemented it coz of navigation to another activity
data class Car(val carImage: Int, val carName: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(carImage)
        parcel.writeString(carName)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Car> {
        override fun createFromParcel(parcel: Parcel): Car {
            return Car(parcel)
        }

        override fun newArray(size: Int): Array<Car?> {
            return arrayOfNulls(size)
        }
    }
}
