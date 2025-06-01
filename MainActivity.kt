package com.example.togglebutton

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var toggle: ToggleButton
    private lateinit var image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggle = findViewById<ToggleButton>(R.id.toggle)
        image = findViewById<ImageView>(R.id.image)

        toggle.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked){
                image.setImageResource(R.drawable.cat_android_studio)
            }
            else{
                image.setImageResource(R.drawable.dog_android_studio_2)
            }
        }
    }
}