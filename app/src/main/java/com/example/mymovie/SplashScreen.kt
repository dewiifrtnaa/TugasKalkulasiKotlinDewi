package com.example.mymovie

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {

    private lateinit var moveTo : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        moveTo = move_to
        moveTo.setOnClickListener {
            val moveToActivity = Intent (this, MainActivity::class.java)
            startActivity(moveToActivity)
        }
    }
}