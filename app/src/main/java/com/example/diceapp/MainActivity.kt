package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btnRoll)
        rollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
       // val tvNumber: TextView = findViewById(R.id.tvNumber)
        //val randomInt = Random().nextInt(6) + 1, this did not work i had to remove the parenthesis
        //after Random

        val randomInt = Random.nextInt(6) + 1

       // tvNumber.text = randomInt.toString()

        val diceImage : ImageView = findViewById(R.id.iVDiceImage)

        val drawableResource = when (randomInt) {
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
           else ->R.drawable.dice_6
        }



    }
}