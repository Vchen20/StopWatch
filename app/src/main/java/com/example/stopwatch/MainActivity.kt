package com.example.stopwatch

import android.content.res.Configuration
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    companion object{
        val TAG = "MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

}




