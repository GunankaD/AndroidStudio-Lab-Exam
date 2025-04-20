package com.example.checkboxstationeryshop

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // extract checkboxes and button
        val button : Button = findViewById<Button>(R.id.button)

        val pen : CheckBox = findViewById<CheckBox>(R.id.pen)
        val pencil : CheckBox = findViewById<CheckBox>(R.id.pencil)
        val gbox : CheckBox = findViewById<CheckBox>(R.id.geometryBox)
        val notebook : CheckBox = findViewById<CheckBox>(R.id.notebook)
        val scale : CheckBox = findViewById<CheckBox>(R.id.scale)

        // 20% discount if price above 50
        button.setOnClickListener {
            var totalPrice : Double = 0.0
            var index : Int = 0
            val result : StringBuilder = StringBuilder()
            result.append("Your Items are as follows:")

            if(pen.isChecked){
                ++ index
                totalPrice += 10
                result.append("\n$index) Pen (10 Rs)")
            }
            if(pencil.isChecked){
                ++ index
                totalPrice += 2
                result.append("\n$index) Pencil (2 Rs)")
            }
            if(gbox.isChecked){
                ++ index
                totalPrice += 100
                result.append("\n$index) Geometry Box (100 Rs)")
            }
            if(notebook.isChecked){
                ++ index
                totalPrice += 60
                result.append("\n$index) Classmate 100 pages Notebook (60 Rs)")
            }
            if(scale.isChecked){
                ++ index
                totalPrice += 5
                result.append("\n$index) Scale (5 Rs)")
            }

            result.append("\nTotal amount : $totalPrice Rs")
            if(totalPrice >= 50){
                result.append("\n\n20% discount applied")
                totalPrice = totalPrice - (totalPrice * 0.2)
            }

            result.append("\nGrand Total : $totalPrice Rs")

            val cart : TextView = findViewById<TextView>(R.id.cart)
            val confirmButton : Button = findViewById<Button>(R.id.confirmButton)
            cart.text = result
            confirmButton.visibility = View.VISIBLE

            confirmButton.setOnClickListener {
                Toast.makeText(this, "Successful Buyout!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
