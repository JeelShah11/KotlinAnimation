package com.example.animationdemoapplication

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.TransitionDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView


class CrossfadeAnimationActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var imageView:AppCompatImageView
    var mCurrentDrawable = 0
    lateinit var crossfader: TransitionDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crossfade_animation)


        imageView = findViewById(R.id.imageView)

        val bitmap0 = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        val bitmap1 = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        var canvas = Canvas(bitmap0)
        canvas.drawColor(Color.RED)
        canvas = Canvas(bitmap1)
        canvas.drawColor(Color.GREEN)
        val drawables = arrayOfNulls<BitmapDrawable>(2)
        drawables[0] = BitmapDrawable(resources, bitmap0)
        drawables[1] = BitmapDrawable(resources, bitmap1)

         crossfader = TransitionDrawable(drawables)
        imageView.setImageDrawable(crossfader)
        imageView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        mCurrentDrawable = if (mCurrentDrawable == 0) {
            crossfader.startTransition(500)
            1
        } else {
            crossfader.reverseTransition(500)
            0
        }
    }
}
