package com.playground.funtions

import java.time.LocalDate

fun main(){
    printName("Phelim")
    addition(1,3)
    additionApproach(3,2)
    printPersonalDetails("Phelim","isi@chaim.com",LocalDate.parse("2022-12-26"))
    printPersonalDetails(dob = LocalDate.parse("2022-12-26"), name = "Linus", email = "isichei@gmail,com")
}

fun addition(x: Int, y: Int):Int {
    return x+y
}

fun additionApproach(x: Int, y: Int) = x+y

fun printName(s: String) {

}

fun printPersonalDetails(name: String, email: String, dob: LocalDate){
    println("Name: $name, Email: $email, DOB: $dob")
}
