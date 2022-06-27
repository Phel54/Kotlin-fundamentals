package com.playground.basics

fun main(){
    for (i in 1..5){
        println("i: $i")
        if (i==3) break
    }
    println("End of program")

    label()
    println("==========================")
    label2()
}

fun label2() {
    loop@ for (i in 1..5){
        println("i in label: $i")
        innerLoop@ for (j in 1..5){
            println("J in label $j")
            if (j==2)continue@loop
        }
    }
}

fun label() {
    loop@ for (i in 1..5){
        println("i in label: $i")
       innerloop@ for (j in 1..5){
           println("J in label $j")
            if (j==2)break@innerloop
        }
    }
}
