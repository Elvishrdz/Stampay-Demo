package com.eahm.stampaydemo.models

data class Campaing(
    val title : String = "",
    val subtitle : String = "",
    val starsCurrent : Int = 0,
    val starsTotal : Int = 0,
    val giftAmount : Int = 0,
    val photoUrl : String = ""
)