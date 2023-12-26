package com.example.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
        division()
        first()
    }

    fun first() {
        second()
        Log.v(TAG, "1")
    }

    fun second() {
        third()
        Log.v(TAG, "2")
        fourth()
    }

    fun third() {
        Log.v(TAG, "3")
    }

    fun fourth() {
        Log.v(TAG, "4")
    }

    fun division() {
        val numerator = 60
        var denominator = 4
        repeat(4) {
            Log.d(TAG, "$denominator")
            Log.v(TAG, "${numerator / denominator}")
            denominator--
        }
    }

    fun logging() {
        Log.e(TAG, "ERROR: a serious error like an app crash")
        Log.w(TAG, "WARN: warns about the potential for serious errors")
        Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
        Log.d(TAG, "DEBUG: reporting technical information useful for debugging")
        Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")
    }
}