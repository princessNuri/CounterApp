package com.example.counterapp.presenter

import com.example.counterapp.model.CounterModel
import com.example.counterapp.view.CounterView

class Presenter {
    private val model=CounterModel()
    lateinit var view:CounterView

    fun incrementCount(){
        model.increment()
        view.updateCount(model.getCount())
        if(model.getCount()==+10){
            view.showToastIncrement()
        }
        if(model.getCount()==15){
            view.getColor()
        }
    }
    fun decrementCount(){
        model.decrement()
        view.updateCount(model.getCount())
        if(model.getCount()==-10){
            view.showToastDecrement()
        }
    }
    fun attachView(view: CounterView){
        this.view= view
    }
}