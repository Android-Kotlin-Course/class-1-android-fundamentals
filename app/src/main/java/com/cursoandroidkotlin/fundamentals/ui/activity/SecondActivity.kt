package com.cursoandroidkotlin.fundamentals.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.cursoandroidkotlin.fundamentals.R
import com.cursoandroidkotlin.fundamentals.ui.fragment.NAME_DATA

/**
 * @author Santiago Carrillo
 * 2020-02-16.
 */
class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        if (intent.extras != null) {
            val name = intent.getStringExtra(NAME_DATA)
            Log.d("Developer", "Name: $name")
        }
    }
}