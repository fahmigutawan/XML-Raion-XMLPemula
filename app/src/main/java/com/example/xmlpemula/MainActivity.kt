package com.example.xmlpemula

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.dynamic_ui_demo)
        var state = true
        val btn = findViewById<Button>(R.id.btn)
        val txt = findViewById<TextView>(R.id.text)
        val blueBox = findViewById<FrameLayout>(R.id.bluebox)

        btn.setOnClickListener {
            state = !state
            if(state){
                txt.visibility = View.VISIBLE
                blueBox.visibility = View.GONE
            } else {
                txt.visibility = View.GONE
                blueBox.visibility = View.VISIBLE
            }
        }
    }
}