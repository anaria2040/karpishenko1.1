package com.example.myapplication2122

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for (i in 1..100){
            if (i%3==0){ println ("Piff ")}
            if (i%5==0){ println("Paff ")}
        }
            }

    }

