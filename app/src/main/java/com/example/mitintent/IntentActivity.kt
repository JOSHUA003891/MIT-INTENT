package com.example.mitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent.*
import org.jetbrains.anko.email
import org.jetbrains.anko.makeCall
import org.jetbrains.anko.sendSMS
import org.jetbrains.anko.share

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        btn_sms.setOnClickListener {
sendSMS("0795644805","hello Jp how is you this is Rocky from USA")
        }
        btn_stk.setOnClickListener {
val safaricom=this@IntentActivity.packageManager.getLaunchIntentForPackage("com.android.stk");
        }
        btn_email.setOnClickListener {
email("peterjoshua456@gmail.com")
        }
        btn_share.setOnClickListener {
share("hello joshua how is you")
        }
        btn_dial.setOnClickListener {

        }
        btn_call.setOnClickListener {
makeCall("0795644805")
        }
        btn_camera.setOnClickListener {

        }
    }
}