package com.playground.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String,
    var courseCategory: CourseCategory = CourseCategory.PHYSICS
) {

}

enum class CourseCategory{
    PHYSICS,
    MARKETING,
    TEXT
}
fun main(){
    val course = Course(1,"Reactive Programming","Phelim")
    println(course)
}