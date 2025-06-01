package com.example.intents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name: EditText = findViewById<EditText>(R.id.name);
        val password: EditText = findViewById<EditText>(R.id.password);
        val b: Button = findViewById<Button>(R.id.btn);

        b.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java);
            intent.putExtra("Name", name.text.toString());
            intent.putExtra("Password", password.text.toString());
            startActivity(intent);
        }
    }
}