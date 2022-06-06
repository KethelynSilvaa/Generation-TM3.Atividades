package com.generation.ciclovidaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Ciclo", "onCreate")

        val buttonext = findViewById<Button>(R.id.button_next)

        val intentSegTela = Intent(this, Tela2::class.java)

        buttonext.setOnClickListener {
            startActivity(intentSegTela)
         }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Ciclo","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo","onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ciclo","onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ciclo","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ciclo","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo", "onDestroy")
    }
}