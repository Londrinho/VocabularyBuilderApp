package com.jimmy.vocabularybuliderapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener { rollDice() }
    }
    fun rollDice(){
        val firstDice = Dice()
        val ranNumb = firstDice.rollTheDice()

        val diceImage: ImageView = findViewById(R.id.imageView)


        val drawableResource =  when (ranNumb){
            1 -> R.drawable.capricious
            2 -> R.drawable.cumulate
            3 -> R.drawable.egotist
            4 -> R.drawable.exonerate
            5 -> R.drawable.intoxicate
            6 -> R.drawable.maculated
            7 -> R.drawable.precocious
            8 -> R.drawable.vindicate
            9 -> R.drawable.perambulate
            10 -> R.drawable.etiquette
            11 -> R.drawable.susurrus
            12 -> R.drawable.incipient
            13 -> R.drawable.enormousness
            14 -> R.drawable.filial
            15 -> R.drawable.propitious
            16 -> R.drawable.nascent
            17 -> R.drawable.orgulous
            18 -> R.drawable.febrile
            19 -> R.drawable.risible
            20 -> R.drawable.normenclature
            else -> R.drawable.capricious
        }

        diceImage.setImageResource(drawableResource)

        diceImage.contentDescription = ranNumb.toString()


    }

    class Dice {

        fun rollTheDice(): Int {
            val ranNumBer = (0..20).random()
            return ranNumBer
        }
    }

}