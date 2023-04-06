package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {

     @Override
    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.main);
         val b1 = findViewById<Button>(R.id.button)
         b1.setOnClickListener(this)

     }
    @Override
    override fun onClick(v: View?) {
        val i: Intent = Intent(this, WelcomePage2::class.java)
        startActivity(i)
    }
}


