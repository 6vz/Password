package com.mateusz.password

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputA = findViewById<EditText>(R.id.inputA)
        val inputB = findViewById<EditText>(R.id.inputB)
        val button = findViewById<Button>(R.id.button)



        button.setOnClickListener() {

        }

    }
}