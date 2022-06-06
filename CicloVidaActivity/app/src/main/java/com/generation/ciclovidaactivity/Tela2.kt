package com.generation.ciclovidaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val buttonBack = findViewById<Button>(R.id.button_Back)
        buttonBack.setOnClickListener {
            finish()
        }
    }
}