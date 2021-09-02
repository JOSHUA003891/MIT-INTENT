package com.example.mitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Btn_Calc.setOnClickListener {
            val calculator=Intent(this,CalcActivity::class.java)
            startActivity(calculator)}

        Btn_Intent.setOnClickListener {
            val int=Intent(this,IntentActivity::class.java)
            startActivity(int)

            Btn_Web.setOnClickListener {
                val web=Intent(this,WebActivity::class.java)
                startActivity(web)
            }
        }
    }
}