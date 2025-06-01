package com.example.spinner

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val reportTextView: TextView = findViewById(R.id.report)
        val spinnerCountry: Spinner = findViewById(R.id.spinnerCountry)


        val countries = arrayOf("Argentina", "Australia", "Brazil", "Bangladesh", "Canada",
            "Denmark", "France", "Germany", "Kenya", "Lebanon", "Mexico", "Oman", "Portugal", "Spain", "United Kingdom")


        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countries)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerCountry.adapter = adapter

        spinnerCountry.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                reportTextView.text = "Selected Country: ${countries[position]}"
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                reportTextView.text = "No country selected"
            }
        }
    }
}