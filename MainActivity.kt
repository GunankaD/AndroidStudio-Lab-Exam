package com.example.datetimepicker

import android.icu.util.Calendar
import android.os.Bundle
import android.widget.DatePicker
import android.widget.TimePicker
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datePicker = findViewById<DatePicker>(R.id.datePicker);

        val today = Calendar.getInstance();
        datePicker.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH)){view, year, month, day ->
            val month = month + 1;
            val msg = "hey"
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }

        onClickTime();

    }

    private fun onClickTime(){
        val timePicker = findViewById<TimePicker>(R.id.timePicker);

        timePicker.setOnTimeChangedListener { _, hour, minute ->
            var hour = hour;
            var am_pm = "";
            when{
                hour == 0 -> {
                    hour += 12;
                    am_pm = "AM";
                }
                hour == 12 -> am_pm = "PM"
                hour > 12 -> {
                    hour -= 12;
                    am_pm = "PM"
                }
            }

            Toast.makeText(this, "$hour : $minute $am_pm", Toast.LENGTH_SHORT).show();
        }
    }
}