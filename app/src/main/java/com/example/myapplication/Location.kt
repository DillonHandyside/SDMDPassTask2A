package com.example.myapplication

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Location(
    val image: Int,
    val title: String,
    val description: String,
    val location: String,
    val lastVisited: String,
    val rating: Float
) : Parcelable

