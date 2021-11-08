package com.example.Kotlin

class Player(val name: String) {
    var lives = 3;
    var level = 1;
    var score = 0;

    fun show(){
        println("""
            name: $name
            lives: $lives
            level: $level
            score: $score
        """)
    }

}