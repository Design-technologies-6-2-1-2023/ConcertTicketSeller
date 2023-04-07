package com.example.myapplication.Organization.ui.login.Error

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.myapplication.Organization.ui.login.AvtorizeOrg
import com.example.myapplication.Organization.ui.login.RecoverPasswordOrg
import com.example.myapplication.R
import com.example.myapplication.WelcomePage.WelcomePage2

class ErrorUncorrectPassword : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error_uncorrect_password)
        val b1 = findViewById<Button>(R.id.RepeatPassword)
        b1.setOnClickListener(this)

        val b2 = findViewById<Button>(R.id.RecoverPassword)
        b1.setOnClickListener(this)

    }
    @Override
    override fun onClick(v: View?) {
        if (v != null) {
            if(v.getId()==R.id.RepeatPassword) {
                val i: Intent = Intent(this, AvtorizeOrg::class.java)
                startActivity(i)
            }else{
                val i: Intent = Intent(this, RecoverPasswordOrg::class.java)
                startActivity(i)
            }
        }
    }
}