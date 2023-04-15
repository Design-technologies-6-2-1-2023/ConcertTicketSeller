package com.example.myapplication.ByerUi.EvenFavoritetRealization

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.ByerUi.EventModal
import com.example.myapplication.ByerUi.PreferanceRealization.Prefarence
import com.example.myapplication.NAUser.Catalog
import com.example.myapplication.R

class Favorite : AppCompatActivity(), View.OnClickListener {
    var states = ArrayList<EventModal>()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)
        // начальная инициализация списка
        setInitialData()
        val recyclerView = findViewById<RecyclerView>(R.id.list)
        // создаем адаптер
        val adapter = EventAdapter(this, states)
        // устанавливаем для списка адаптер
        recyclerView.adapter = adapter


        val b2=findViewById<ImageButton>(R.id.Catalog)
        b2.setOnClickListener(this)

        val b1=findViewById<ImageButton>(R.id.imageButton8)
        b1.setOnClickListener(this)
    }

    private fun setInitialData() {
        states.add(EventModal("bgbg", "bgf", 5, "fvfdsv", R.drawable.vkz))
        states.add(EventModal("bgb", "gfbg", 5, "fvfdsv", R.drawable.vkz))
        states.add(EventModal("bg", "gbfg", 5, "fvfdsv", R.drawable.vkz))
        states.add(EventModal("gb", "bfg", 5, "fvfdsv", R.drawable.vkz))
        states.add(EventModal("gb", "gfb", 5, "fvfdsv", R.drawable.vkz))
    }

    override fun onClick(v: View?) {
        if (v != null) {
            if (v.getId() == R.id.Catalog) {
                val i: Intent = Intent(this, Catalog::class.java)
                startActivity(i)
            }else if (v.getId() == R.id.imageButton8) {
                val i: Intent = Intent(this, Prefarence::class.java)
                startActivity(i)
            }

        };
    }
}