package com.example.stopwatch

import android.content.res.Configuration
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.Chronometer
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var start : Button
    lateinit var reset : Button
    lateinit var stopWatch : Chronometer

    companion object{
        val TAG = "MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        Log.d(TAG, "onCreate: ")
        Log.e()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ")
        Log.e()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
        Log.e()
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
        Log.e()
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
        Log.e()
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
        Log.e()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
        Log.e()
    }


    private fun wireWidgets() {
        start = findViewById(R.id.button_main_start)
        reset = findViewById(R.id.button_main_reset)
        stopWatch = findViewById(R.id.chronometer_main_stopwatch)
    }




}




