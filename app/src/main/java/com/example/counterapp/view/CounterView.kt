package com.example.counterapp.view

interface CounterView {
    fun updateCount(count :Int) {}
    fun showToastIncrement(){}
    fun showToastDecrement(){}
    fun getColor(){}
}