package com.example.ejercicio9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


fun main() {

    println("Ingrese el valor")

val input= readLine()!!.toDouble()
    val fahrenheit =((9.0/5.0)*input) +32
    println("Fahrenheit: $fahrenheit")

//val celciusToFahrenheit  = (input * 9 / 5)+ 32
   // println("fahrenheit")

    val kelvin = input + 273.15
    println("Kelvin: $kelvin")

    val fahrenheitToKelvin = 5/9.0 * (fahrenheit- 32)+ 273.15

  fun  isLetters(string: String): Boolean {
        return string.none { it !in 'A'..'Z' && it !in 'a'..'z' }
    }
}