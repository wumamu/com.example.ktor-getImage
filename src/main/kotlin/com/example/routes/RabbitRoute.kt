package com.example.routes

import com.example.data.modle.Rabbit
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

private const val BASE_URL = "http://192.168.1.125:8080"
//192.168.1.125
private val rabbits = listOf(
    Rabbit("Daikun", "Cute gut","$BASE_URL/rabbits/1.png"),
    Rabbit("Carl", "Cute gut","$BASE_URL/rabbits/2.png")
)
fun Route.randomRabbit(){
    get("/randomrabbit"){
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
    }
}