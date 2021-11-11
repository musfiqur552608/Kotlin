package com.example.Kotlin

fun main(args: Array<String>){
    val sayed = Player("Sayed",4,8, 0)
//    println(sayed.name)
//    println(sayed.lives)
//    println(sayed.level)
//    println(sayed.score)

    sayed.show()

    val sakib = Player("Sakib", 5, 10, 1000)
    sakib.show()

    /*println(sakib.weapon.name.toUpperCase())
    println(sakib.weapon.damageInflicted)*/

//    val axe = Weapon("Axe", 12)
//    sayed.weapon = axe
//    println(sayed.weapon.name)
//    println(axe.name)
//
//    axe.damageInflicted = 24
//    println(axe.damageInflicted)

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    sakib.inventory.add(redPotion)
    sakib.showInventory()


    println(sakib.toString())



}