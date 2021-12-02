package com.example.poem_log_test

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "— Скажи-ка, дядя, ведь не даром")
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "Москва, спаленная пожаром,")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Французу отдана?")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Ведь были ж схватки боевые,")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Да, говорят, еще какие!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Недаром помнит вся Россия")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Про день Бородина!")
    }

}