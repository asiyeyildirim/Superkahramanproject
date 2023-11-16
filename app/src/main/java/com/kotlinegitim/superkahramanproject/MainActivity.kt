package com.kotlinegitim.superkahramanproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun superKahramanYap(view: View){

        val name = nameText.text.toString()
        val age = ageText.text.toString()
        val job = jobText.text.toString()

        sonucText.text = "İsim: ${name}  Yaş: ${age} Meslek:${job}"

    }
}