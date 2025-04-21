package com.example.customcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var amount : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pencil : CheckBox = findViewById<CheckBox>(R.id.pencil)
        val pen : CheckBox = findViewById<CheckBox>(R.id.pen)
        val notebook : CheckBox = findViewById<CheckBox>(R.id.notebook)

        val result : TextView = findViewById<TextView>(R.id.result)


        pencil.setOnClickListener {
            if(pencil.isChecked){
                amount += 2
                Toast.makeText(this, "Pencil was added to cart", Toast.LENGTH_SHORT).show()
            }
            else {
                amount -= 2
                Toast.makeText(this, "Pencil was removed from cart", Toast.LENGTH_SHORT).show()
            }
            result.text = "Grand total : $amount Rs"
        }

        pen.setOnClickListener{
            if(pen.isChecked) {
                amount += 5
                Toast.makeText(this, "Pen was added to cart", Toast.LENGTH_SHORT).show()
            }
            else {
                amount -= 5
                Toast.makeText(this, "Pen was removed from cart", Toast.LENGTH_SHORT).show()
            }
            result.text = "Grand total : $amount Rs"
        }

        notebook.setOnClickListener {
            if(notebook.isChecked) {
                amount += 10
                Toast.makeText(this, "Notebook was added to cart", Toast.LENGTH_SHORT).show()
            }
            else {
                amount -= 10
                Toast.makeText(this, "Notebook was removed from cart", Toast.LENGTH_SHORT).show()
            }
            result.text = "Grand total : $amount Rs"
        }

        result.text = "Grand total : $amount Rs"
    }
}




