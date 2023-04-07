package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.myapplication.ByerRegister.ui.login.RegisterOrg
import com.example.myapplication.Organization.ui.login.AvtorizeOrg

class ChooseRegOrAvt : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_reg_or_avt)

        val b1 = findViewById<Button>(R.id.register)
        b1.setOnClickListener(this)

        val b2 = findViewById<Button>(R.id.avtorize)
        b2.setOnClickListener(this)
    }
    @Override
    override fun onClick(v: View?) {
        if (v != null) {
            if(v.getId()==R.id.register){
                val i: Intent = Intent(this, RegisterOrg::class.java)
                startActivity(i)
            }else{
                val i: Intent = Intent(this, AvtorizeOrg::class.java)
                startActivity(i)
            }

        }

    }



}