package com.silvereax.app

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(60, 60, 60, 60)
            setBackgroundColor(0xFF0F0F0F.toInt())
        }

        val title = TextView(this).apply {
            text = "SILVER EAX"
            textSize = 38f
            setTextColor(0xFFC0C0C0.toInt())
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Welcome to your app\nBuilt successfully!"
            textSize = 18f
            setTextColor(0xFFFFFFFF.toInt())
            gravity = Gravity.CENTER
            setPadding(0, 40, 0, 40)
        }

        val button = Button(this).apply {
            text = "Click Me"
            setOnClickListener {
                Toast.makeText(this@MainActivity, "SILVER EAX is working!", Toast.LENGTH_SHORT).show()
            }
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(button)
        setContentView(layout)
    }
}
