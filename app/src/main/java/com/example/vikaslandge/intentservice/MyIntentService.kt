package com.example.vikaslandge.intentservice

import android.app.IntentService
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.net.URL

var bpm : Bitmap? = null

class MyIntentService : IntentService(""){
    override fun onHandleIntent(p0: Intent?) {

        var url = URL("http://www.bollywoodlife.com/wp-content/uploads/2017/09/SRK-210212.jpg")
        var isr = url.openStream()
        bpm = BitmapFactory.decodeStream(isr)

        var i = Intent()
        i.setAction("iservice_task_done")
        //  i.putExtra("image", bpm)

        sendBroadcast(i)
    }



}