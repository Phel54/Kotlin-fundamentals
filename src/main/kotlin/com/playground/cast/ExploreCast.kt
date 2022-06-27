package com.playground.cast

import com.playground.classes.Course

fun main(){
    val course = Course(1,"Lim","Phelim")

    checkType(course)
    checkType("course")
}

fun checkType(type: Any) {
    when(type){
        is Course -> println(type)
        is String -> println(type )
    }
}
