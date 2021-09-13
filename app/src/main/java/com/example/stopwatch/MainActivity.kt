package com.example.stopwatch

import android.content.res.Configuration
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.os.SystemClock
import android.util.Log
import android.widget.Button
import android.widget.Chronometer
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var start : Button
    lateinit var reset : Button
    lateinit var stopWatch : Chronometer
    var x = false
    var time = 0
    companion object{
        val TAG = "MainActivity"
    }
    private fun wireWidgets() {
        start = findViewById(R.id.button_main_start)
        reset = findViewById(R.id.button_main_reset)
        stopWatch = findViewById(R.id.chronometer_main_stopwatch)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wireWidgets()
        start.setOnClickListener {

            if(!x)
            {
                stopWatch.base = SystemClock.elapsedRealtime() + time
                stopWatch.start()
                x = true
            }
            else{
                stopWatch.stop()
                x = false
                time = (stopWatch.base - SystemClock.elapsedRealtime()).toInt()
            }
        }
        reset.setOnClickListener {
            stopWatch.base = SystemClock.elapsedRealtime()
            time = 0
        }



    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        Log.d(TAG, "onCreate: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }






}




