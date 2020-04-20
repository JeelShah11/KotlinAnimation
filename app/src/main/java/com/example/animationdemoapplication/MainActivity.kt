package com.example.animationdemoapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView

class MainActivity : AppCompatActivity() ,View.OnClickListener{

    lateinit var imageView:AppCompatImageView
    lateinit var buttonZoom:AppCompatButton
    lateinit var buttonCLockWize:AppCompatButton
    lateinit var buttonFade:AppCompatButton
    lateinit var buttonBlink:AppCompatButton
    lateinit var buttonMove:AppCompatButton
    lateinit var buttonSlide:AppCompatButton
    lateinit var buttonBounce:AppCompatButton
    lateinit var buttonTogether:AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        buttonZoom = findViewById(R.id.buttonZoom)
        buttonZoom.setOnClickListener(this)
        buttonCLockWize = findViewById(R.id.buttonClockWise)
        buttonCLockWize.setOnClickListener(this)
        buttonFade = findViewById(R.id.buttonFade)
        buttonFade.setOnClickListener(this)
        buttonBlink = findViewById(R.id.buttonBlink)
        buttonBlink.setOnClickListener(this)
        buttonMove = findViewById(R.id.buttonMove)
        buttonMove.setOnClickListener(this)
        buttonSlide = findViewById(R.id.buttonSlide)
        buttonSlide.setOnClickListener(this)

        buttonBounce = findViewById(R.id.buttonBounce)
        buttonBounce.setOnClickListener(this)

        buttonTogether = findViewById(R.id.buttonTogether)
        buttonTogether.setOnClickListener(this)
    }

    fun zoom(view: View) {

        val animation = AnimationUtils.loadAnimation(
            this,R.anim.myanimation)

        imageView.startAnimation(animation)
    }

    fun clockwise(view: View) {

        val animation = AnimationUtils.loadAnimation(
            this,R.anim.clockwise)

        imageView.startAnimation(animation)
    }

    fun fade(view: View) {

        val animation = AnimationUtils.loadAnimation(
            this,R.anim.fade)

        imageView.startAnimation(animation)
    }

    fun blink(view: View) {

        val animation = AnimationUtils.loadAnimation(
            this,R.anim.blink)

        imageView.startAnimation(animation)
    }

    fun move(view: View) {

        val animation = AnimationUtils.loadAnimation(
            this,R.anim.move)

        imageView.startAnimation(animation)
    }

    fun slide(view: View) {

        val animation = AnimationUtils.loadAnimation(
            this,R.anim.slide)

        imageView.startAnimation(animation)
    }

    fun bounce(view: View) {

        val animation = AnimationUtils.loadAnimation(
            this,R.anim.bounce)

        imageView.startAnimation(animation)
    }

    fun together(view: View) {

        val animation = AnimationUtils.loadAnimation(
            this,R.anim.together)

        imageView.startAnimation(animation)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.buttonZoom->{
                zoom(imageView)
            }
            R.id.buttonClockWise->{
                clockwise(imageView)
            }
            R.id.buttonFade->{
                fade(imageView)
            }
            R.id.buttonBlink->{
                blink(imageView)
            }
            R.id.buttonMove->{
                move(imageView)
            }
            R.id.buttonSlide->{
                slide(imageView)
            }
            R.id.buttonBounce->{
                bounce(imageView)
            }
            R.id.buttonTogether->{
                together(imageView)
            }
        }
    }
}
