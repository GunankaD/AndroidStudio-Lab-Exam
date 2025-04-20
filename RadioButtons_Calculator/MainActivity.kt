package com.example.radiobuttons

import android.os.Bundle
import android.provider.MediaStore.Audio.Radio

import android.widget.EditText
import android.widget.TextView
import android.widget.RadioGroup
import android.widget.Button
import android.widget.Toast

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 : EditText = findViewById<EditText>(R.id.num1)
        val num2 : EditText = findViewById<EditText>(R.id.num2)
        val radioG : RadioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val button : Button = findViewById<Button>(R.id.button)
        val result : TextView = findViewById<TextView>(R.id.result)

        button.setOnClickListener{
            val a : Double? = num1.text.toString().toDoubleOrNull()
            val b : Double? = num2.text.toString().toDoubleOrNull()

            if(a == null || b == null) {
                Toast.makeText(this, "Please Enter inputs", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val operation = radioG.checkedRadioButtonId
            val res = when (operation){
                R.id.add -> a + b
                R.id.multi -> a * b
                R.id.sub -> a - b
                R.id.divide -> if(b != 0.0) a / b else "ERROR : Division by Zero"
                else -> "Please Select an Operation"
            }
            result.text = "Result : $res"
        }


    }
}
