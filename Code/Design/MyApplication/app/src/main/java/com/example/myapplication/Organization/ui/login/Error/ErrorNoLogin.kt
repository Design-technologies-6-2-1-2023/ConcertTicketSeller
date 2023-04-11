package com.example.myapplication.Organization.ui.login.Error

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.myapplication.ByerRegister.ui.login.RegisterOrg
import com.example.myapplication.R

class ErrorNoLogin : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error_no_login)
        val b1 = findViewById<Button>(R.id.register)
        b1.setOnClickListener(this)
    }

    @Override
    override fun onClick(v: View?) {
        val i: Intent = Intent(this, RegisterOrg::class.java)
        startActivity(i)
    }
}