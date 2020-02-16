package com.cursoandroidkotlin.fundamentals.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cursoandroidkotlin.fundamentals.R

/**
 * @author Santiago Carrillo
 * 2020-02-16.
 */
class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}