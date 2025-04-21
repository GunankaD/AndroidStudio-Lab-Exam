package com.example.imageviewlistener

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun choco(view : View){
        Toast.makeText(this, "Chocolate Delight", Toast.LENGTH_SHORT).show()
    }

    fun zucchini(view: View){
        Toast.makeText(this, "Zucchini Brownies", Toast.LENGTH_SHORT).show()
    }

    fun strawberry(view : View){
        Toast.makeText(this, "Strawberry Shortcake", Toast.LENGTH_SHORT).show()
    }
}