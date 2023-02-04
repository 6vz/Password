package com.mateusz.password

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputA = findViewById<EditText>(R.id.inputA)
        val inputB = findViewById<EditText>(R.id.inputB)
        val button = findViewById<Button>(R.id.button)

        val passwordMatching = findViewById<CheckBox>(R.id.passwordMatching)
        val capitalLetter = findViewById<CheckBox>(R.id.capitalLetter)
        val smallLetter = findViewById<CheckBox>(R.id.smallLetter)
        val numberIncluded = findViewById<CheckBox>(R.id.numberIncluded)
        val specialIncluded = findViewById<CheckBox>(R.id.specialIncluded)

        button.setOnClickListener() {

        }

    }
}