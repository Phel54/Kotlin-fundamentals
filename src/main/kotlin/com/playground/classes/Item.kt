package com.playground.classes

class Item() {
    var name: String = ""
    var phoneNumber: String = "0557640572"
    var price: Double = 0.0
    get() {
        println("Inside Getter")
        return field
    }
    set(value) {
        println("Inside Setter")
        if (value>=0.0){
            field=value
        } else{
            throw IllegalArgumentException("Negative value not accepted")
        }
    }

    constructor(_name: String) : this() {
        name = _name
    }

    constructor(_name: String, _phoneNumber: String) : this(_name) {
        name = _name
        phoneNumber = _phoneNumber
    }
}

fun main() {
    val item = Item(_name = "Iphone")
    val item1 = Item(_name = "Phelim", _phoneNumber = "7878")
    println("Item name is ${item.name}")
    println("Item 1 name is ${item1.name} and phone number is ${item1.phoneNumber}")
    item.price = 10.0
    println("Item price ${item.price}")
}