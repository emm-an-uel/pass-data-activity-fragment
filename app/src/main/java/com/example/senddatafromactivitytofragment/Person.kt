package com.example.senddatafromactivitytofragment

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Person(
    val name: String,
    val age: Int
    ) : Parcelable