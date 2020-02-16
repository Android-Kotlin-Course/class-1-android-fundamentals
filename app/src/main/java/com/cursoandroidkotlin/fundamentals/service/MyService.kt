package com.cursoandroidkotlin.fundamentals.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

/**
 * @author Santiago Carrillo
 * 2020-02-16.
 */
class MyService : Service() {

    override fun onBind(intent: Intent?): IBinder? {
        Log.d("Developer", "inside onBind on MyService!")
        return null
    }

}