package com.example.animationdemoapplication

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatImageView

class AnimationDrawableActivity : AppCompatActivity() {

    lateinit var animationDrawable:AnimationDrawable
    lateinit var imageView:AppCompatImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_drawable)

        imageView = findViewById(R.id.imageView)

        imageView.apply {
            setBackgroundResource(R.drawable.animation)

            animationDrawable = background as AnimationDrawable
        }


        imageView.setOnClickListener {
            animationDrawable.start()
        }
    }
}
