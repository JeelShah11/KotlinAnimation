package com.example.animationdemoapplication.springanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.widget.ImageViewCompat
import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.dynamicanimation.animation.SpringAnimation
import androidx.dynamicanimation.animation.SpringForce
import com.example.animationdemoapplication.R

class SpringAnimationActivity : AppCompatActivity() {

    lateinit var imageView:AppCompatImageView
    lateinit var springAnimation: SpringAnimation
    lateinit var springForce: SpringForce

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spring_animation)

        imageView = findViewById(R.id.imageView)

    }

    fun StartAnimation(view: View) {
        springAnimation = SpringAnimation(imageView,DynamicAnimation.Y)
        springForce = SpringForce()
        springForce.dampingRatio = SpringForce.DAMPING_RATIO_HIGH_BOUNCY
        springForce.stiffness = SpringForce.STIFFNESS_LOW
        springForce.finalPosition = 1000f

        springAnimation.spring = springForce

        springAnimation.start()
    }
}
