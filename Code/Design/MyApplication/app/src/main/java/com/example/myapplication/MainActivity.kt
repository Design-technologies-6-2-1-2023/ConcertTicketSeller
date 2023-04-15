package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.ByerUi.CatalogRealization.Catalog
import com.example.myapplication.WelcomePage.WelcomePage2


class MainActivity : AppCompatActivity(), View.OnClickListener {

     @SuppressLint("WrongViewCast")
     @Override
    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.main);
         val b1 = findViewById<Button>(R.id.button)
         b1.setOnClickListener(this)

         val b2=findViewById<ImageButton>(R.id.imageButton)
         b2.setOnClickListener(this)

     }
    @Override
    override fun onClick(v: View?) {
        if (v != null) {
            if(v.getId ()==R.id.button) {
                val i: Intent = Intent(this, WelcomePage2::class.java)
                startActivity(i)
            }else{
                val i: Intent = Intent(this, Catalog::class.java)
                startActivity(i)
            }
        }
    }
}


