package com.generation.projectbottondados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rolardado= findViewById<Button>(R.id.buttond6)
        rolardado.setOnClickListener {
        rolard6(6)

        val dado12 = findViewById<Button>(R.id.buttond12)
        dado12.setOnClickListener {
            dado12(12)
            val dado20 = findViewById<Button>(R.id.buttond20)
            dado20.setOnClickListener {
                dado20(20)
            }
        }
        }
    }
    private fun rolard6( lados: Int) {
        val dado6 = (1..lados).random()

        val textd6 = findViewById<TextView>(R.id.buttond6)
        val image = findViewById<ImageView>(R.id.imageView)

        when(dado6){
            1 -> image.setImageResource(R.drawable.dice_1)
            2 -> image.setImageResource(R.drawable.dice_2)
            3 -> image.setImageResource(R.drawable.dice_3)
            4 -> image.setImageResource(R.drawable.dice_4)
            5 -> image.setImageResource(R.drawable.dice_5)
            6 -> image.setImageResource(R.drawable.dice_6)
        }
            }
    fun dado12(lado12: Int){

        val d12 =(1..lado12).random()

        val textd12 = findViewById<TextView>(R.id.buttond12)
        val image = findViewById<ImageView>(R.id.imageView)

        when (d12){
           in 1..lado12 -> image.setImageResource(R.drawable.dice_6)

        }



    }
    fun dado20(lado20: Int){

        val d12 =(1..lado20).random()

        val textd12 = findViewById<TextView>(R.id.buttond20)
        val image = findViewById<ImageView>(R.id.imageView)

        when (d12){
            in 1..lado20 -> image.setImageResource(R.drawable.dice_6)

        }



    }


    }
