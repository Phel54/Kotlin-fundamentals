package com.playground.basics

class Variables {
}

fun main() {
    val name: String = "Dilip"
    println(name)

    val salary = 3000L
    println(salary)

    val course = "Kotlin Springboot"
    println("course : $course and the course length is ${course.length}")

    val multiLine = "ABC \n DEF"
    println(multiLine)

    val multiLine3 = """ 
        ABC
        DEF
        GHL
    """.trimIndent()
    println(multiLine3)

}