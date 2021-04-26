package com.example.visitsouthkorea.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Destinasi(
        var photoHotel : Int = 0,
        var infoHotel : String? = null,
        var photoRestaurant : Int = 0,
        var infoRestaurant : String? = null,
        var photoMuseum : Int = 0,
        var infoMuseum : String? = null,
        var photoFashion : Int = 0,
        var infoFashion : String? = null,
        var photoMarket : Int = 0,
        var infoMarket : String? = null,
        var photoNature : Int = 0,
        var infoNature : String? = null,
) : Parcelable