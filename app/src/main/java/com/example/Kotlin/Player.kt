package com.example.Kotlin

import androidx.recyclerview.widget.RecyclerView

//class Player(val name: String) {
//    var lives = 3;
//    var level = 1;
//    var score = 0;

class Player(val name:String, var lives:Int, var level:Int, var score:Int)
{
    var weapon: Weapon = Weapon("Fist", 1)
    val inventory = ArrayList<Loot>()

    fun show(){
        /*println("""
            name: $name
            lives: $lives
            level: $level
            score: $score
            weapon: ${weapon.name}
            damage: ${weapon.damageInflicted}
        """)*/
        if(lives>0){
            println("$name is alive")
        }else{
            println("$name is dead")
        }
    }

    override fun toString(): String {
        return """
            name: $name
            lives: $lives
            level: $level
            score: $score
            weapon: ${weapon}
            
        """
    }

    fun showInventory(){
        println("$name's Inventory")
        for (item in inventory){
            println(item)
        }
        //println(inventory.get(0))
        println("=========================")
    }

}