package com.example.st3

import android.graphics.BitmapFactory
import android.graphics.drawable.PictureDrawable
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import com.caverock.androidsvg.SVG

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Assets are synced on build:
        // repo root ASSETS/** -> app/src/main/assets/design/**
        loadPngInto(findViewById(R.id.splashBg), "design/Img_Splash.png")
        loadSvgInto(findViewById(R.id.splashLogo), "design/Logo Synaps.svg")
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