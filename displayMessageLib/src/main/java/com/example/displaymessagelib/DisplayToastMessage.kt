package com.example.displaymessagelib

import android.app.Activity
import android.content.Context
import android.widget.Toast

class DisplayToastMessage {
    companion object{
        fun displayMessage(context:Context,msg:String)
        {
            Toast.makeText(context,msg,Toast.LENGTH_LONG)
        }
    }
}