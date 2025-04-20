package com.example.buttononclicklistener

import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 : EditText = findViewById<EditText>(R.id.num1);
        val num2 : EditText = findViewById<EditText>(R.id.num2);
        val button : Button = findViewById<Button>(R.id.addButton);
        val result : TextView = findViewById<TextView>(R.id.result);

        button.setOnClickListener {
            val a : Double = num1.text.toString().toDoubleOrNull() ?: 0.0;
            val b : Double = num2.text.toString().toDoubleOrNull() ?: 0.0;
            val sum : Double = a + b;
            result.text = "Result : $sum";
        }
    }
}