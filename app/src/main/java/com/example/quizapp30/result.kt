package com.example.quizapp30

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        var intent = intent
        var recieved_username  = intent.getStringExtra(Constants.username)
        var score = intent.getStringExtra("score")
        tv.text = "Congratulation!! ${recieved_username}"
        tv1.text = "Your score is"+ " "+score


        last_button.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}