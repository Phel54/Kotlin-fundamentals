package com.playground.collections

fun main (){
    val addLambda = {x:Int -> x+x}

    val addResult = addLambda(3)
    println("addResult : $addResult")

    val multiplyLambda = {x:Int, y:Int ->
        println("X is $x, Y is $y")
        x*y}
    val multiplyResult = multiplyLambda(3,2)
    println("multiplyResult : $multiplyResult")

   val result =  calculate(2,3) { a, b -> a * b }
    println("Result : $result")

}
/*
Higher Order Function -  A function that accepts a function as a parameter.
 */
fun calculate(x:Int, y:Int, op: (x:Int, y:Int)->Int): Int{
    return op(x,y)
}