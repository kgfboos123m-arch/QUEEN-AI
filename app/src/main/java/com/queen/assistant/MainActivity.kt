package com.queen.assistant

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.view.Gravity
import android.graphics.Color

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val textView = TextView(this)
        textView.text = "QUEEN IS READY!"
        textView.textSize = 30f
        textView.setTextColor(Color.RED)
        textView.setBackgroundColor(Color.BLACK)
        textView.gravity = Gravity.CENTER
        
        setContentView(textView)
    }
}
