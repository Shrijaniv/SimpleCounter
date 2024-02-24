package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val text = findViewById<TextView>(R.id.text)
        val upgradeButton = findViewById<Button>(R.id.upgradeBtn)
        var counter = 0
        button.setOnClickListener{
            counter++
            text.text = counter.toString()
            if(counter >= 100){
                upgradeButton.visibility = View.VISIBLE
                upgradeButton.setOnClickListener{
                    button.text = "ADD 2"

                    button.setOnClickListener {
                        counter += 2
                        text.text = counter.toString()
                    }
                    upgradeButton.visibility = View.INVISIBLE
                }
            }
        }

    }
}