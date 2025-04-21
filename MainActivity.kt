package com.example.logcatactivitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val tag = "Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val msg = "onCreate"
        Log.d(tag, msg)
    }

    override fun onStart(){
        super.onStart()
        val msg = "onStart"
        Log.d(tag, msg)
    }

    override fun onResume() {
        super.onResume()

        val msg : String = "onResume"
        Log.d(tag, msg)
    }

    override fun onPause(){
        super.onPause()
        val msg = "onPause"
        Log.d(tag, msg)
    }

    override fun onStop(){
        super.onStop()
        val msg = "onStop"
        Log.d(tag, msg)
    }

    override fun onDestroy(){
        super.onDestroy()
        val msg = "onDestroy"
        Log.d(tag, msg)
    }

    override fun onRestart(){
        super.onRestart()
        val msg = "onRestart"
        Log.d(tag, msg)
    }
}