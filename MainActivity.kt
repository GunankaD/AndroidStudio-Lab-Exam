package com.example.alertdialog

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.widget.EditText
import android.widget.Button

import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uid : EditText = findViewById<EditText>(R.id.username)
        val password : EditText = findViewById<EditText>(R.id.password)

        val button : Button = findViewById<Button>(R.id.login)
        Log.d("MainActivity", "onCreate")

        button.setOnClickListener {
            // provide basic checks in exam
            val builder = AlertDialog.Builder(this)
            builder.setIcon(R.drawable.baseline_error_24)
            builder.setTitle("Login Confirmation")
            builder.setMessage("Are you sure you want to proceed?")

            builder.setPositiveButton("Yes"){ dialogInterface, which ->
                Toast.makeText(this, "Clicked on Yes", Toast.LENGTH_SHORT).show()
            }

            builder.setNegativeButton("No, Go back"){dialogInterface, which ->
                Toast.makeText(this, "Clicked on No", Toast.LENGTH_SHORT).show()
            }

            builder.setNeutralButton("Cancel"){dialogInterface,which ->
                Toast.makeText(this, "Clicked on Cancel", Toast.LENGTH_SHORT).show()
            }

            val alertdialog : AlertDialog = builder.create()
            alertdialog.setCancelable(false)
            alertdialog.show()
        }
    }
}