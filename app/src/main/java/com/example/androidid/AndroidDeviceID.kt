package com.example.androidid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.TextView

class AndroidDeviceID : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_device_id)

       var tx = findViewById<View>(R.id.android_id) as TextView
       var deviceID = Settings.Secure.getString(this.contentResolver, Settings.Secure.ANDROID_ID)

        tx.setText("Android id is:: " + deviceID.toString())
    }
}