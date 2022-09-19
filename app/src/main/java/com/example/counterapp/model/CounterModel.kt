package com.example.counterapp.model

class CounterModel {
    private var count = 0
    fun increment(){
         count++
    }
    fun getCount():Int{
        return count
    }
    fun decrement(){
        count--
    }
}