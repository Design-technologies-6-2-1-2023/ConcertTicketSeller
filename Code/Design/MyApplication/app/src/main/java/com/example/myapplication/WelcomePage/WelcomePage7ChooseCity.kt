package com.example.myapplication.WelcomePage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.myapplication.ChooseRegOrAvt
import com.example.myapplication.R

class WelcomePage7ChooseCity : AppCompatActivity(), View.OnClickListener {
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page7_choose_city);
        val b1 = findViewById<Button>(R.id.button)
        b1.setOnClickListener(this)

    }
    @Override
    override fun onClick(v: View?) {
        val i: Intent = Intent(this, ChooseRegOrAvt::class.java)
        startActivity(i)
    }
}