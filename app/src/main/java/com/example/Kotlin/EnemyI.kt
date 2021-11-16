package com.example.Kot

import com.example.Kotlin.Enemy
import com.example.Kotlin.Troll
import com.example.Kotlin.Vampyre

fun main(args: Array<String>) {
//    val enemy = Enemy("Test enemy", 10, 3)
//    println(enemy)
//    enemy.takeDamage(4)
//    println(enemy)
//
//    enemy.takeDamage(11)
//    println(enemy)

    val uglyTroll = Troll("Ugly Troll")
    println(uglyTroll)
    uglyTroll.takeDamage(30)
    println(uglyTroll)

    val vlad = Vampyre("Vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)
}