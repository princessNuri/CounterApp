package com.example.counterapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counterapp.databinding.ActivityMainBinding
import com.example.counterapp.presenter.Presenter
import com.example.counterapp.view.CounterView

class MainActivity() : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding
    private val presenter=Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()
    }
    private fun initClicker() {
        binding.incrementBtn.setOnClickListener{
            presenter.incrementCount()
        }
        binding.decrementBtn.setOnClickListener{
            presenter.decrementCount()
        }
    }
    override fun updateCount(count: Int) {
        binding.counterTv.text=count.toString()
    }
    override fun showToastIncrement() {
        showToast("Congrats on 10")
    }
    override fun showToastDecrement() {
        showToast("Congrats on -10")
    }
    override fun getColor() {
        binding.counterTv.setBackgroundColor(Color.GREEN)
    }
}