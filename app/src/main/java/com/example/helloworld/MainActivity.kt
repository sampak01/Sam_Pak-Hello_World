package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var helloButton: Button
    private lateinit var helloText: TextView
    override fun onCreate(savedInstanceState: Bundle?){

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloButton = findViewById(R.id.hello_button)
        helloText = findViewById(R.id.hello_text)



        helloButton.setOnClickListener { view: View ->
            // Do something in response to the click here
            //helloText.text = "Hello World!"
            helloText.text = "Hello World!"
        }
    }
}