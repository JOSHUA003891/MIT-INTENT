package com.example.mitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import android.os.Build
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        webViewSetup()
    }
    private fun webViewSetup(){
        webView.webViewClient= WebViewClient()
    webView.apply {
        loadUrl("https://www.youtube.com")
        settings.javaScriptEnabled=true
        settings.safeBrowsingEnabled=true
    }
    }
}