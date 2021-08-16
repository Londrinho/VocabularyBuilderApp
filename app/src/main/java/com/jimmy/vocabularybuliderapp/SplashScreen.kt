package com.jimmy.vocabularybuliderapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {

    // Splash screen timer
    private val SPLASH_TIME_OUT = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        Handler(Looper.getMainLooper()).postDelayed({

            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
            finish()
        }, 3000)

    }
}