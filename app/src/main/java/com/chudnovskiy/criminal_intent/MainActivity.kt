package com.chudnovskiy.criminal_intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
        if (currentFragment == null) {
            val fragment = CrimeFragment()
            supportFragmentManager.beginTransaction().add(R.id.fragment_container,fragment).commit()
        }
        Log.d(TAG, "onCreate() -=MainActivity=- called")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() -=MainActivity=- called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() -=MainActivity=- called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() -=MainActivity=- called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }
}