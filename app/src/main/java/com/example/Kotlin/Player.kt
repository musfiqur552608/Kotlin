package com.example.Kotlin

import androidx.recyclerview.widget.RecyclerView

//class Player(val name: String) {
//    var lives = 3;
//    var level = 1;
//    var score = 0;

class Player(val name:String, var lives:Int, var level:Int, var score:Int)
{
    var weapon: Weapon = Weapon("Fist", 1)


    fun show(){
        println("""
            name: $name
            lives: $lives
            level: $level
            score: $score
        """)
    }

}