package com.playground.classes

// open is attached to a class so that that class can be extended/inherited by other classes

open class User(val name: String) {
   open fun login(){
        println("Inside user login")
    }
    open val isLoggedIn : Boolean = false
    private fun secret() = println("Inside Secret")
}

class Student(name: String) : User(name) //Student inheriting from User class
 {
     override fun login() {
         println("Login: Inside Student class")
         super.login()
     }
     companion object{
         const val noOfEnrolledCourse = 3
         fun country() = "USA"
     }
     override var isLoggedIn : Boolean = false
 }

class Instructor(name: String) : User(name) //Instructor class inheriting from User class
{
    override fun login() {
        println("Login: Inside Instructor class")
    }
}
fun main(){
    val student = Student("Alex")
    println("Student name is ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Logged in values is: ${student.isLoggedIn}")
    val country = Student.country()
    println("Country: $country")
    println("Enrolled courses: ${Student.noOfEnrolledCourse}")

    val instructor = Instructor("Phelim")
    println("Instructor name is ${instructor.name}")
    instructor.login()

}