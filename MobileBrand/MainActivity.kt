package com.example.customradiobuttonmobilephone

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.widget.RadioGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById<Button>(R.id.button)
        val radio : RadioGroup = findViewById<RadioGroup>(R.id.radiog)
        val exit : Button = findViewById<Button>(R.id.exit)

        button.setOnClickListener {
            val checked = radio.checkedRadioButtonId
            if(checked == -1){
                Toast.makeText(this, "Please choose a brand", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val res : String = when(checked){
                R.id.iphone ->"IPhone"
                R.id.samsung -> "Samsung"
                R.id.pixel -> "Pixel"
                R.id.nokia -> "Nokia"
                else -> "NONE"
            }

            val builder = AlertDialog.Builder(this)

            builder.setTitle("Confirmation")
            builder.setMessage("Are you sure u want to pick $res?")
            builder.setPositiveButton("Yes") {_, _ ->
                Toast.makeText(this, "You picked $res!", Toast.LENGTH_SHORT).show()
            }
            builder.setNegativeButton("No") {_, _ ->
                Toast.makeText(this, "Please pick a brand again", Toast.LENGTH_SHORT).show()
            }

            val alertdialog = builder.create()
            alertdialog.setCancelable(false)
            alertdialog.show()
        }

        exit.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            builder.setTitle("Confirmation")
            builder.setMessage("Are you sure u want to exit app?")
            builder.setPositiveButton("Yes") {_, _ ->
                finish()
            }
            builder.setNegativeButton("No"){_, _ ->
                Toast.makeText(this, "Cancelled Exit", Toast.LENGTH_SHORT).show()
            }

            val alertdialog = builder.create()
            alertdialog.setCancelable(false)
            alertdialog.show()
        }

    }
}