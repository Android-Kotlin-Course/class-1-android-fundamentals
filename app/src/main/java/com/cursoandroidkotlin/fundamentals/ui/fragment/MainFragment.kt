package com.cursoandroidkotlin.fundamentals.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cursoandroidkotlin.fundamentals.R
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * @author Santiago Carrillo
 * 2020-02-16.
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startSecondActivity.setOnClickListener { onStartSecondActivityClicked() }
    }

    private fun onStartSecondActivityClicked() {
        Log.d("Developer", "onStartSecondActivityClicked!!!")
        //TODO 1. Start second activity
    }

}