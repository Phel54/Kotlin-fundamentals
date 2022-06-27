package com.playground.classes

class Person(
    val name: String = "",
    val age: Int = 0
) {
    var email: String = ""
    var nameLenght: Int = 0

    init {
        println("Inside init block")
        nameLenght = name.length
    }
    constructor(_email : String,_name:String,_age:Int): this(_name,_age){
        email=_email

    }

    fun action() {
        println("Person walks")

    }
}

fun main() {
//    val person = Person("Phelim", 23)
//    person.action()
//    println("Name: ${person.name} and the age is ${person.age}")

    var person1 = Person(_email = "isi@gmail.com","Klenam",23)
    println("Name: ${person1.name}, age is ${person1.age} and email ${person1.email}, ${person1.nameLenght}")
}