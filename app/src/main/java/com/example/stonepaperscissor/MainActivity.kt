package com.example.stonepaperscissor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pushButton : Button = findViewById(R.id.button)
        pushButton.setOnClickListener{ pushnum() }


    }

    private fun pushnum() {
        val num = (1..3).random()

        val actionImage: ImageView = findViewById(R.id.imageView)

        val drawableResource = when(num){
            1 -> R.drawable.stone
            2 -> R.drawable.paper
            else -> R.drawable.scissor
        }

        actionImage.setImageResource(drawableResource)

        actionImage.contentDescription = num.toString()
    }
}