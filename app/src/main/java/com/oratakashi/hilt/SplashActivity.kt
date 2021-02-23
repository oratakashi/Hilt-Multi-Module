package com.oratakashi.hilt

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.oratakashi.hilt.main.ui.main.LibraryActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(
                Intent(applicationContext, LibraryActivity::class.java)
//                Intent(applicationContext, MainActivity::class.java)
            )
        }, 3000L)
    }
}