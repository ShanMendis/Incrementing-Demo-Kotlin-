package com.example.incrementingcalculator

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var number = 0;

    fun add1(){
        number++;
    }

    fun add2(){
        number += 2;
    }

    fun clear(){
        number=0;
    }
}