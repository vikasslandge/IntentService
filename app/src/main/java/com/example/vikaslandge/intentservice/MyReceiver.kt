package com.example.vikaslandge.intentservice

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.ImageView
import android.widget.Toast

class MyReceiver(var iview :ImageView) : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {

       // Toast.makeText(p0,"rrrrrr",Toast.LENGTH_LONG).show()
        iview.setImageBitmap(bpm)
    }

}