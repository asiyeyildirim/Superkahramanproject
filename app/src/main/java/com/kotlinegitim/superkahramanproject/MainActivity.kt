package com.kotlinegitim.superkahramanproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var numara = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numara = 12
    }


    fun superKahramanYap(view: View){
        numara = 12

        val name = nameText.text.toString()
        val age = ageText.text.toString().toIntOrNull()
        val job = jobText.text.toString()

        if (age == null){
            sonucText.text = "Doğru Yaşı Giriniz"

        }
        else{
            val superKahraman = SuperKahraman(name, age, job)

            sonucText.text = "İsim: ${superKahraman.name}  Yaş: ${superKahraman.age} Meslek:${superKahraman.job}"

        }



    }
}