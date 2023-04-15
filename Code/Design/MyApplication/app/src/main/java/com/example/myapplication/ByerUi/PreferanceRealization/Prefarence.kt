package com.example.myapplication.ByerUi.PreferanceRealization

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.ByerUi.EvenFavoritetRealization.EventAdapter
import com.example.myapplication.ByerUi.EventModal
import com.example.myapplication.NAUser.Catalog
import com.example.myapplication.R

class Prefarence : AppCompatActivity(), View.OnClickListener {
    var states = ArrayList<EventModal>()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prefarence)
        // начальная инициализация списка
        setInitialData()
        val recyclerView = findViewById<RecyclerView>(R.id.list)
        // создаем адаптер
        val adapter = PrefarenceAdapter(this, states)
        // устанавливаем для списка адаптер
        recyclerView.adapter = adapter


        val b2=findViewById<ImageButton>(R.id.Catalog)
        b2.setOnClickListener(this)
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
            }

        };
    }
}