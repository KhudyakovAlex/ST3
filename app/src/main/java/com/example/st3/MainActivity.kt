package com.example.st3

import android.graphics.Color
import android.graphics.BitmapFactory
import android.graphics.drawable.PictureDrawable
import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.caverock.androidsvg.SVG

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        applySystemBarsStyle()

        // Assets are synced on build:
        // repo root ASSETS/** -> app/src/main/assets/design/**
        loadPngInto(findViewById(R.id.splashBg), "design/Img_Splash.png")
        loadSvgInto(findViewById(R.id.splashLogo), "design/Logo Synaps.svg")
    }

    private fun applySystemBarsStyle() {
        // Make system bars blend with the splash tint/background (like the top bar).
        // Our layout already draws edge-to-edge; keep bars transparent where possible.
        WindowCompat.setDecorFitsSystemWindows(window, false)

        val tintColor = Color.parseColor("#CC04677E") // 80% opacity of #04677E

        // Navigation bar: transparent on modern Android so content shows through.
        // On older versions, set the tint directly.
        window.navigationBarColor = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            Color.TRANSPARENT
        } else {
            tintColor
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            window.isNavigationBarContrastEnforced = false
        }

        // Ensure nav/status icons are light (white) to match dark-ish background.
        val insetsController = WindowInsetsControllerCompat(window, window.decorView)
        insetsController.isAppearanceLightNavigationBars = false
        insetsController.isAppearanceLightStatusBars = false
    }

    private fun loadPngInto(view: ImageView, assetPath: String) {
        try {
            assets.open(assetPath).use { input ->
                val bitmap = BitmapFactory.decodeStream(input)
                view.setImageBitmap(bitmap)
            }
        } catch (_: Exception) {
            // Keep placeholder (tools:src) if the asset is missing/unreadable.
        }
    }

    private fun loadSvgInto(view: ImageView, assetPath: String) {
        try {
            val drawable = assets.open(assetPath).use { input ->
                val svg = SVG.getFromInputStream(input)
                PictureDrawable(svg.renderToPicture())
            }
            view.setLayerType(ImageView.LAYER_TYPE_SOFTWARE, null)
            view.setImageDrawable(drawable)
        } catch (_: Exception) {
            // Keep placeholder (tools:src) if the asset is missing/unreadable.
        }
    }
}