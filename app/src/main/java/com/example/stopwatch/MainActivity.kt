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
import kotlin.concurrent.timer
import kotlin.math.abs

class MainActivity : AppCompatActivity() {
    lateinit var start : Button
    lateinit var reset : Button
    lateinit var stopWatch : Chronometer
    var on = false
    var t = 0L
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

            if(!on)
            {
                stopWatch.base = abs(SystemClock.elapsedRealtime() - t)
                stopWatch.start()
                on = true
                start.text = "Stop"
            }
            else{
                stopWatch.stop()
                on = false
                t = abs(SystemClock.elapsedRealtime() - stopWatch.base)
                start.text = "Start"
            }
        }
        reset.setOnClickListener {
            stopWatch.base = SystemClock.elapsedRealtime()
            t = 0
        }




    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        if(on){
            t = abs((SystemClock.elapsedRealtime() - stopWatch.base))
        }
        outState.putLong("saveTime", t)
        outState.putBoolean("saveOn", on)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        t = savedInstanceState.getLong("saveTime")
        on = savedInstanceState.getBoolean("saveOn")
        stopWatch.base = abs(SystemClock.elapsedRealtime() - t)
        if(on) {
            stopWatch.start()
            start.text = "Stop"

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
        wireWidgets()
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




