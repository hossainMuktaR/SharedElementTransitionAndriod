package com.hossain.sharedelementtransitionandroid

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.ActivityOptionsCompat
import android.util.Pair as UtilPair

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // active windowActivitytransition in theme.xml
        // then start activity with view and view.transitionName that define in second_activity xml file
        val birdImage = findViewById<ImageView>(R.id.birdImage)
        val userName = findViewById<TextView>(R.id.userName)

        birdImage.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            val options = ActivityOptions
                .makeSceneTransitionAnimation(
                    this,
                    UtilPair.create(birdImage, "birdimage"),
                    UtilPair.create(userName, "username"),
                )
            startActivity(intent, options.toBundle())
        }
    }
}