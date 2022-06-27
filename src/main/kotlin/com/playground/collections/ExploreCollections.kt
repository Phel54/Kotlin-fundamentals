package com.playground.collections

fun main (){
    val names = listOf("Phelim","Alex","Ben")
    println("Names: $names")

    val namesMutableList = mutableListOf("Phelim","Alex","Ben")
    namesMutableList.add("Bernice")
    println("Names: $namesMutableList")

    val set = setOf("Phelim","Pascal","Pascal")
    println("set: $set")

    val setMutable = mutableSetOf("Phelim","Pascal","Pascal")
    setMutable.add("Bernice")
    println("set: $setMutable")

    val mapH = mapOf("Phelim" to 25,"Bernice" to 23)
    println("Map: $mapH")

    val mutableMap = mutableMapOf("Phelim" to 25,"Bernice" to 23)
    mutableMap["Nunya"] = 24
    println("mutalbleMap: $mutableMap")



}
