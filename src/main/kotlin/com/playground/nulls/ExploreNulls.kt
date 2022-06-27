package com.playground.nulls

data class Movie(
    val id: Int?,
    val name : String
)

fun main(){
    var nameNullable : String? = null
    println("Value is ${nameNullable?.length}") // safe operator, ? is a safe operator

    val length = nameNullable?.length ?: 0 // Elvis operator "?:", this checks the left-hand side and if it is null it uses the value of the right side.

    //Java way of doing a safe call
//    if (nameNullable!=null){
//        print("Value is ${nameNullable.length}")
//    }

    nameNullable = "Phelim"
    println("Value is $nameNullable")

    var nameNonNullable : String = "Phelim"
    println("Value is $nameNonNullable")

    val movie = Movie(null,"Avengers")
    val savedMovie = saveMovie(movie)
    println("Saved movie: $savedMovie")
}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
}
