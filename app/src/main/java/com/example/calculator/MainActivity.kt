package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import java.lang.Math.pow

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.sumNubmers.setOnClickListener {
            val number1 = binding.firstNumberEditText.text.toString().toInt()
            val number2 = binding.secondNumberEditText.text.toString().toInt()
            val sum: Int = number1 + number2
            binding.resultTextView.text = sum.toString()
        }
        binding.minNumbers.setOnClickListener {
            val number1 = binding.firstNumberEditText.text.toString().toInt()
            val number2 = binding.secondNumberEditText.text.toString().toInt()
            val minus: Int = number1 - number2
            binding.resultTextView.text = minus.toString()
        }
        binding.modNumbers.setOnClickListener {
            val number1 = binding.firstNumberEditText.text.toString().toInt()
            val number2 = binding.secondNumberEditText.text.toString().toInt()
            val mod: Int = number1 % number2
            binding.resultTextView.text = mod.toString()
        }
        binding.multiplyNubmers.setOnClickListener {
            val number1 = binding.firstNumberEditText.text.toString().toInt()
            val number2 = binding.secondNumberEditText.text.toString().toInt()
            val multiply: Int = number1 * number2
            binding.resultTextView.text = multiply.toString()
        }
        binding.exponentNumbers.setOnClickListener {
            val number1 = binding.firstNumberEditText.text.toString().toInt()
            val number2 = binding.secondNumberEditText.text.toString().toInt()
            val exponent: Long = pow(number1.toDouble(),number2.toDouble()).toLong()
            binding.resultTextView.text = exponent.toString()
        }
        binding.reminderNumbers.setOnClickListener {
            val number1 = binding.firstNumberEditText.text.toString().toInt()
            val number2 = binding.secondNumberEditText.text.toString().toInt()
            val reminder: Int = number1/number2
            binding.resultTextView.text = reminder.toString()
        }
    }
}