package com.playground.collections

import com.playground.dataset.Course
import com.playground.dataset.CourseCategory
import com.playground.dataset.KAFKA
import com.playground.dataset.courseList


fun main() {
    val courseList = courseList()
    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
    val designPredicate = { c: Course -> c.category == CourseCategory.DESIGN }


//    exploreFilter(courseList,devPredicate)
//    exploreFilter(courseList,designPredicate)

//    exploreMap(courseList, designPredicate)
   val course =  exploreFlatMap(courseList, KAFKA)
    println(course)
    //

    val list = listOf(listOf(1, 2, 3), listOf(4, 5, 6))
    val flatMapResult = list.flatMap { outerList ->
        outerList.map {
            it.toDouble()
        }
    }
//    println(flatMapResult)

    //
    exploreHashMap()

    collection_nullability()
}

fun collection_nullability() {
    val list : List<String>? = null

    list?.forEach {  }
}

fun exploreHashMap() {
    val nameAgeMutableMap = mutableMapOf("Phelim" to 25, "Phelim" to 6)
    nameAgeMutableMap.forEach { (k,v)->
        println("Key: $k, value: $v")
    }

    val value = nameAgeMutableMap.getOrElse("Phelim1") { "Kelu" }
    print("result is : $value")

}

fun exploreMap(courseList: MutableList<Course>, designPredicate: (Course) -> Boolean) {
    val courses = courseList
        .filter(designPredicate).map { "${it.name} - ${it.category}" }
        .forEach { println(it) }
    println("Course: $courses")
}

fun exploreFilter(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {
    val developmentCourses = courseList
        .filter {
            predicate.invoke(it)
        }.forEach {
            println("Courses: $it")
        }

}fun exploreFilterUsingSequence(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {
    val developmentCourses = courseList
        .filter {
            predicate.invoke(it)
        }.forEach {
            println("Courses: $it")
        }

}


fun exploreFlatMap(courseList: MutableList<Course>, kafka: String): List<String> {
   val kafkaCourse =  courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered.filter { it == kafka }.map { courseName }
    }
    return kafkaCourse
}
