package com.maytemur.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            //val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            //toast.show()
            //val resultTextView: TextView = findViewById(R.id.textView)
            //resultTextView.text = "6"
            rollDice()
        }
        // Do a dice roll when the app starts - ekranda kolay görünsün diye açılırken bir atış yap!
        rollDice()
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceRoll2 = dice.roll2()
        val luckyNumber = 6
        val resultTextView: TextView = findViewById(R.id.textView)
        val resultTextView2: TextView = findViewById(R.id.textView2)
        val diceImage: ImageView = findViewById(R.id.imageView)
        val diceImage2: ImageView = findViewById(R.id.imageView2)

//        if (diceRoll == luckyNumber) {
//            resultTextView.text = "You win with the lucky Number " + diceRoll.toString()
//            diceImage.setImageResource(R.drawable.dice_4)
//        } else {
//            resultTextView.text = diceRoll.toString()
//        }
        diceImage.contentDescription = diceRoll.toString()
        diceImage2.contentDescription = diceRoll.toString()
        when (diceRoll) {
            luckyNumber -> {
                resultTextView.text = "You rolled a 6. Try again"
                diceImage.setImageResource(R.drawable.dice_6)
            }
            1 -> {
                resultTextView.text = "So sorry! you rolled a 1. Try again"
                diceImage.setImageResource(R.drawable.dice_1)
            }
            2 -> {
                resultTextView.text = "Sadly,you rolled a 2. Try again"
                diceImage.setImageResource(R.drawable.dice_2)
            }
            3 -> {
                resultTextView.text = "Unfortunately rolled a 3.Try again"
                diceImage.setImageResource(R.drawable.dice_3)
            }
            5 -> {
                resultTextView.text = "Don't cry! you rolled a 5. Try again"
                diceImage.setImageResource(R.drawable.dice_5)
            }
            4 -> {
                resultTextView.text = "Apologies!You rolled a 4. Try again"
                diceImage.setImageResource(R.drawable.dice_4)
            }
        }
        when (diceRoll2) {
            luckyNumber -> {
                resultTextView2.text = "You rolled a 6 .Try again"
                diceImage2.setImageResource(R.drawable.dice_6)
            }
            1 -> {
                resultTextView2.text = "So sorry! you rolled a 1. Try again"
                diceImage2.setImageResource(R.drawable.dice_1)
            }
            2 -> {
                resultTextView2.text = "Sadly,you rolled a 2. Try again"
                diceImage2.setImageResource(R.drawable.dice_2)
            }
            3 -> {
                resultTextView2.text = "Unfortunately rolled a 3.Try again"
                diceImage2.setImageResource(R.drawable.dice_3)
            }
            5 -> {
                resultTextView2.text = "Don't cry! you rolled a 5. Try again"
                diceImage2.setImageResource(R.drawable.dice_5)
            }
            4 -> {
                resultTextView2.text = "Apologies!You rolled a 4. Try again"
                diceImage2.setImageResource(R.drawable.dice_4)
            }
        }
        if (diceRoll == diceRoll2) {
            resultTextView.text = "You win the prize!! with 2 lucky number"
            resultTextView2.text = "Congratulations!!!"

        }
    }
}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random() //1 den numsides(6) ya kadar random üret
    }

    fun roll2(): Int {
        return (1..numSides).random()
    }
}

//TODO: Do same app with 2 dice
