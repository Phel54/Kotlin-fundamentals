package com.playground.basics

fun main(){
    val range = 1..20
    for (i in range){
        println("I: $i")
    }

    val reverse = 20 downTo 20
    for (i in reverse){
        println("I: $i")
    }
}