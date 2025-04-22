package com.example.incrementerdecrementer

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val increment : Button = findViewById<Button>(R.id.increment)
        val decrement : Button = findViewById<Button>(R.id.decrement)
        val number : TextView = findViewById<TextView>(R.id.number)

        var num : Int = 0

        increment.setOnClickListener {
            ++ num
            number.text = "$num"
        }

        decrement.setOnClickListener {
            -- num
            number.text = "$num"
        }
    }
}