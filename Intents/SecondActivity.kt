package com.example.intents

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = intent;
        val name: TextView = findViewById<TextView>(R.id.name);
        val password: TextView = findViewById<TextView>(R.id.password);

        name.text = intent.getStringExtra("Name");
        password.text = intent.getStringExtra("Password");

    }
}