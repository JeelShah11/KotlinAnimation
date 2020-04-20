package com.example.animationdemoapplication

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatImageView

class AnimatedVectorDrawableActivity : AppCompatActivity() {

    lateinit var animationDrawable:  AnimatedVectorDrawable
    lateinit var imageView: AppCompatImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animated_vector_drawable)

        imageView = findViewById(R.id.imageView)

        imageView.apply {
            setBackgroundResource(R.drawable.drawable_animationvector)

            animationDrawable = background as AnimatedVectorDrawable
        }

        imageView.setOnClickListener {
            animationDrawable.start()
        }
    }
}