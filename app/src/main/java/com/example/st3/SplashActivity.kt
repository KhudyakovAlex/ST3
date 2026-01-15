package com.example.st3

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat

class SplashActivity : AppCompatActivity() {

    private val handler = Handler(Looper.getMainLooper())
    private val navigateRunnable = Runnable {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Keep system bars, but draw our background behind them so their background matches the splash.
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.statusBarColor = android.graphics.Color.TRANSPARENT
        window.navigationBarColor = android.graphics.Color.TRANSPARENT
        WindowInsetsControllerCompat(window, window.decorView).apply {
            isAppearanceLightStatusBars = false
            isAppearanceLightNavigationBars = false
        }

        setContentView(R.layout.activity_splash)

        loadSplashBackground(findViewById(R.id.splashBg))
        handler.postDelayed(navigateRunnable, 700L)
    }

    override fun onDestroy() {
        handler.removeCallbacks(navigateRunnable)
        super.onDestroy()
    }

    private fun loadSplashBackground(target: ImageView) {
        // Raster images come from IMG/ and are synced into app assets as assets/design/*
        val assetPath = "design/Img_Splash.png"
        try {
            assets.open(assetPath).use { input ->
                val bmp = BitmapFactory.decodeStream(input)
                if (bmp != null) {
                    target.setImageBitmap(bmp)
                    return
                }
            }
        } catch (_: Throwable) {
            // ignore, fallback below
        }

        // Fallback: solid color (close to the splash tint from the mock)
        target.setBackgroundColor(0xFF04677E.toInt())
    }
}

