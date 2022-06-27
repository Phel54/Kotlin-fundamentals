package com.playground.basics

fun main() {

    val name = "Alex"
    val result = if (name.length == 4) {
        println("Name is four characters")
        name
    } else {
        println("Name is not four characters")
        name
    }
    println(result)

    var position = 1
    position = 3

   val medal = when (position) {
        1 -> "Gold"
        2 -> "Silver"
        3 -> "Bronze"
        else -> "No Medal"
    }
    println(medal)
}