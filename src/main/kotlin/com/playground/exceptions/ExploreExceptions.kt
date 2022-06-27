package com.playground.funtions

fun main(){
//    println("Name is ${nameLength(null)}")
    returnNothing()
}

fun nameLength(name: String?): Int? {
    return try {
        return name!!.length
    } catch (e: java.lang.Exception){
        println("Exception is :$e")
         null
    }
}

fun returnNothing():Nothing{
    throw java.lang.RuntimeException("Exception")
}
