package com.example.Kotlin

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
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
    sayed.getLoot(redPotion)
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.00)
    sayed.getLoot(chestArmor)
    sayed.showInventory()
    sayed.getLoot(Loot("Ring of Protection +2", LootType.RING, 40.25))
    sayed.getLoot(Loot("Invisibility Potion", LootType.POTION, 35.95))

    sayed.showInventory()

    if (sayed.dropLoot(redPotion)){
        sayed.showInventory()
    }
    else{
        println("You don't have a ${redPotion.name}")
    }

    val bluePotion = Loot("Blue Potion", LootType.POTION, 6.00)
    if(sayed.dropLoot(bluePotion)){
        sayed.showInventory()
    }else{
        println("You don't have a ${bluePotion.name}")
    }
    sayed.dropLoot("Invisibility Potion")
    sayed.showInventory()

    //println(sayed.toString())


//    for (i in 10 downTo 0 step 2){
//        println("$i squared is ${i*i}")
//    }
//
//    for (value in 3..100 step 3){
//        if(value % 5 == 0){
//            println(value)
//        }
//    }


}