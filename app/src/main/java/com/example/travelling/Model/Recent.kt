package com.example.travelling.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Recent(
    val id: Int,
    val placeName: String,
    val countryName: String,
    val price: String,
    val images: Int,
    val date: String,
    val description: String,
    val rating: String
): Parcelable
