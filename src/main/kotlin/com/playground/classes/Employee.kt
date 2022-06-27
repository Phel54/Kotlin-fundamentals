package com.playground.classes

data class Employee (
    val id: Int,
    val name: String
        )

fun main(){
    val employee = Employee(1,"Isichei")
//    println(employee)
    val employee1 = Employee(1,"Isichei")
    println("Are these two equal: ${employee == employee1}")

    val employee2 = employee.copy(
        3,
        "Phels"
    )
    println(employee2)
}