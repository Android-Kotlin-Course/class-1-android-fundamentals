package com.cursoandroidkotlin.fundamentals.ui.activity

import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cursoandroidkotlin.fundamentals.R
import com.cursoandroidkotlin.fundamentals.broadcast.MyReceiver
import com.cursoandroidkotlin.fundamentals.service.MyService
import com.cursoandroidkotlin.fundamentals.ui.fragment.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMainFragment()
    }

    private fun showMainFragment() {
        val tag = MainFragment::class.java.simpleName

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, MainFragment(), tag)
            .addToBackStack(tag)
            .commit()
    }


    private fun startSecondActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }


    private fun registerBroadcastReceiver() {
        val receiver = MyReceiver()
        val filter = IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION).apply {
            addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        }
        registerReceiver(receiver, filter)
    }

    private fun startMyService() {
        val serviceIntent = Intent(this, MyService::class.java)
        startService(serviceIntent)
    }

}
