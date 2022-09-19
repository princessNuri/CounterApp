package com.example.counterapp

import com.example.counterapp.model.CounterModel
import com.example.counterapp.presenter.Presenter

class Injector {
    companion object{
        fun getPresenter():Presenter{
            return Presenter()
        }
        fun getModel():CounterModel{
            return CounterModel()
        }
    }
}