package com.hero.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val ss:String = intent.getStringExtra("key").toString()
        val textView: TextView = findViewById<TextView>(R.id.text)
        textView.text = ss
        textView.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("key", "Some Value to IOT Team")
            startActivity(intent)
        }
    }
}