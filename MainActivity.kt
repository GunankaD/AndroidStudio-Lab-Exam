package com.example.customradiobutton

import android.os.Bundle
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radiogroup : RadioGroup = findViewById<RadioGroup>(R.id.radiogroup)
        val result : TextView = findViewById<TextView>(R.id.result)

        radiogroup.setOnCheckedChangeListener { _, id ->
            val res = when (id) {
                R.id.oldmonk -> "Ewww"
                R.id.jaeger -> "A Fine choice indeed"
                R.id.bacardi -> "Mehh"
                else -> "Choose one booze"
            }

            result.text = res
        }
    }
}