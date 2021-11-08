package com.example.incrementingcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast as Toast1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        add1Btn.setOnClickListener{
            viewModel.add1()
            answerText.text = viewModel.number.toString()
        }

        add2Btn.setOnClickListener{
            viewModel.add2()
            answerText.text = viewModel.number.toString()
        }

        clearBtn.setOnClickListener {
            viewModel.clear()
            answerText.text = viewModel.number.toString()
        }
    }
}