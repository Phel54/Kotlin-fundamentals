package com.playground.collections

import com.playground.dataset.Course
import com.playground.dataset.CourseCategory
import com.playground.dataset.courseList

fun main() {
    val nameListUsingSequence = listOf("alex", "ben", "chloe")
        .asSequence()
        .filter { it.length >=4 }
        .map { it.uppercase() }
        .toList()
//    println("namesListUsingSequence : $nameListUsingSequence")
    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
//    exploreFilterUsingSequence(courseList(),devPredicate)

    val range = 1..1_000_000_000
    range.asSequence().map { it.toDouble() }.forEach { println("Value $it") }
}