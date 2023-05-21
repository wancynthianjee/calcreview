package com.practice.myapplication

import android.app.Activity
import android.app.ActivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import java.util.function.BinaryOperator

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnAdd.setOnClicklistner{ calculate("+") }
        binding.btnSubtract.setOnClicklistner{ calculate("-") }
        binding.btnMultliply.setOnClicklistner{ calculate("%") }
        binding.btnDivide.setOnClicklistner{ calculate("*") }

    }


}
fun calculate(operator:String)
val