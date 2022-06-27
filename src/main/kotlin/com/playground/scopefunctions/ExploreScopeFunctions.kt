package com.playground.scopefunctions

import com.playground.classes.Course
import com.playground.classes.CourseCategory

class ExploreScopeFunctions {


}

fun main() {
//    exploreApply()
//    exploreAlso()
//    exploreLet()
//    exploreWith()
    exploreRun()
}

fun exploreRun() {
    var numbers: MutableList<Int>? = null
    val result = numbers.run {
        numbers = mutableListOf(1,2,3,4,5)
        numbers?.sum()
    }
    println("Run result is : $result")

    val length = run {
        val name = "Phelim"
        println(name)
        name.length
    }
    println(length)
}


fun exploreWith() {
    val numbers = mutableListOf(1,2,3,4,5)
    val result = with(numbers){
        println("Size ${numbers.size}")
        numbers.plus(6)
        numbers.sum()
    }
    println("With Results: $result")
}

fun exploreLet() {
    val numbers = mutableListOf(1,2,3,4,5)
    val result = numbers.map { it*2 }.filter { it>5 }.let {
        println(it)
        it.sum()
    }
    println(result)

    var name : String ? = null
    name = "Phelim"
    val result1 = name?.let {
        println(it)
        it.uppercase()
    }
    println(result1)
}

fun exploreAlso() {
    val course = Course(1, "Reactive Programming", "Phelim").also {
        it.courseCategory = CourseCategory.MARKETING
        println(it)
    }
//    println(course)
}

fun exploreApply() {
    val course = Course(1, "Reactive Programming", "Phelim").apply { courseCategory = CourseCategory.MARKETING }
    println(course)
}
