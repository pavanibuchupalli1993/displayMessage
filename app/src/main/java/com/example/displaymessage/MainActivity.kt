package com.example.displaymessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.displaymessagelib.DisplayToastMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DisplayToastMessage.displayMessage(this,"my test")
    }
}