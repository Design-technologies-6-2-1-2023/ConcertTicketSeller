package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class WelcomePage6 : AppCompatActivity(), View.OnClickListener {
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page6);
        val b1 = findViewById<Button>(R.id.button)
        b1.setOnClickListener(this)

    }
    @Override
    override fun onClick(v: View?) {
        val i: Intent = Intent(this, WelcomePage7ChooseCity::class.java)
        startActivity(i)
    }
}