package com.example.data.modle

import kotlinx.serialization.Serializable

@Serializable
data class Rabbit(
    val name:String,
    val descrption:String,
    val imageUrl:String
)
