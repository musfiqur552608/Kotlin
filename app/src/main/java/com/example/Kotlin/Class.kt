package com.example.Kotlin

fun main(args: Array<String>){
    val sayed = Player("Sayed")
//    println(sayed.name)
//    println(sayed.lives)
//    println(sayed.level)
//    println(sayed.score)

    sayed.show()

    val sakib = Player("Sakib")
    sakib.level = 5
    sakib.show()


}