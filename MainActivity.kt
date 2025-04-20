package com.example.calculatorbuttons

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // extract inputs and outputs
        val num1 : EditText = findViewById<EditText>(R.id.op1)
        val num2 : EditText = findViewById<EditText>(R.id.op2)
        val result : TextView = findViewById<TextView>(R.id.result)

        // extract all the buttons
        val add : Button = findViewById<Button>(R.id.add)
        val multi : Button = findViewById<Button>(R.id.multi)
        val sub : Button = findViewById<Button>(R.id.sub)
        val divide : Button = findViewById<Button>(R.id.divide)

        add.setOnClickListener{
            val a : Double? = num1.text.toString().toDoubleOrNull()
            val b : Double? = num2.text.toString().toDoubleOrNull()
            if(a == null || b == null){
                Toast.makeText(this, "Please enter both the inputs!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val sum : Double = a + b
            result.text = "Result: $sum"
        }

        sub.setOnClickListener{
            val a : Double? = num1.text.toString().toDoubleOrNull()
            val b : Double? = num2.text.toString().toDoubleOrNull()
            if(a == null || b == null){
                Toast.makeText(this, "Please enter both the inputs!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val diff : Double = a - b
            result.text = "Result: $diff"
        }
        multi.setOnClickListener{
            val a : Double? = num1.text.toString().toDoubleOrNull()
            val b : Double? = num2.text.toString().toDoubleOrNull()
            if(a == null || b == null){
                Toast.makeText(this, "Please enter both the inputs!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val product : Double = a * b
            result.text = "Result: $product"
        }
        divide.setOnClickListener{
            val a : Double? = num1.text.toString().toDoubleOrNull()
            val b : Double? = num2.text.toString().toDoubleOrNull()
            if(a == null || b == null){
                Toast.makeText(this, "Please enter both the inputs!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if(b == 0.0){
                Toast.makeText(this, "Error: Division by Zero", Toast.LENGTH_SHORT).show()
                result.text = "Error..."
                return@setOnClickListener
            }

            val quotient: Double = a / b
            result.text = "Result: $quotient"
        }
    }
}