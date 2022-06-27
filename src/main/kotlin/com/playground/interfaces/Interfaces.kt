package com.playground.interfaces

import com.playground.classes.Course

interface CourseRepository {
    fun getById(id:Int):Course
    fun save(course: Course):Int
    val isCoursePersisted: Boolean
}
interface Repository{
    fun getAll():Any
}

interface A {
    fun doSomething(){
        println("A")
    }
}

interface B {
    fun doSomething(){
        println("B")
    }
}

class SqlCourseRepository : CourseRepository, Repository {
    override fun getById(id: Int): Course {
        return Course(id,
        "Introduction to Biology",
            "Phelim"
        )
    }

    override fun save(course: Course): Int {
        println("Course : $course")
        return course.id
    }

    override val isCoursePersisted: Boolean
        get() = true

    override fun getAll(): Any {
        return "All courses"
    }
}


class NoSqlCourseRepository : CourseRepository {
    override fun getById(id: Int): Course {
        return Course(id,
            "Introduction to Physics",
            "Phelim"
        )
    }

    override fun save(course: Course): Int {
        println("Course : $course")
        return course.id
    }

    override val isCoursePersisted: Boolean
        get() = true
}

class AB : A,B{
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("Something in AB")

    }



}

fun main(){
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println("Course: $course")
   var courseId = sqlCourseRepository.save(course)
    println("Saved course ID: $courseId")

    val noSqlCourseRepository = NoSqlCourseRepository()
    val course1 = noSqlCourseRepository.getById(2)
    println("Course: $course1")
    courseId = noSqlCourseRepository.save(course1)
    println("Saved course ID: $courseId")


    val ab = AB()
    println(ab.doSomething())

}