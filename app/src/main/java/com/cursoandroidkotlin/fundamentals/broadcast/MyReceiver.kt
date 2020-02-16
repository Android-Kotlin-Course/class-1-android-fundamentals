package com.cursoandroidkotlin.fundamentals.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

/**
 * @author Santiago Carrillo
 * 2020-02-16.
 */
class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d("Developer", "Inside onReceive of MyReceiver!!")
    }

}