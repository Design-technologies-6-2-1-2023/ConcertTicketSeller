package com.example.myapplication.NAUser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.ByerUi.CatalogRealization.CategoriesModal
import com.example.myapplication.ByerUi.CatalogRealization.CategoriesRVAdapter
import com.example.myapplication.ByerUi.EventModal
import com.example.myapplication.R

class Catalog : AppCompatActivity(), View.OnClickListener {
    private var categoriesModalArrayList: ArrayList<CategoriesModal>? = null
    private var popularNewsArrayList: ArrayList<EventModal>? = null
    private var sportsNews: ArrayList<EventModal>? = null
    private var techNews: ArrayList<EventModal>? = null
    lateinit private var catRV: RecyclerView

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.myapplication.R.layout.activity_catalog_na)

        catRV = findViewById(com.example.myapplication.R.id.idRVNewsCategories)
        categoriesModalArrayList = ArrayList()

        popularNewsArrayList = ArrayList()
        popularNewsArrayList!!.add(
            EventModal(
                "qq ",
                "qq.",
                5,
                "cccw", R.drawable.vkz
            )
        )

        categoriesModalArrayList!!.add(CategoriesModal("Концерт", popularNewsArrayList!!))

        sportsNews = ArrayList()
        sportsNews!!.add(
            EventModal(
                "AB ",
                "AB ",
                2,
                "qwqwwdwd",R.drawable.vkz
            )
        )


        categoriesModalArrayList!!.add(CategoriesModal("Выставка", sportsNews!!))

        techNews = ArrayList()
        techNews!!.add(
            EventModal(
                "ee ",
                "ee ",
                99
                ,"ccaw",R.drawable.vkz
            )
        )


        categoriesModalArrayList!!.add(CategoriesModal("Матч", techNews!!))

        catRV.setLayoutManager(LinearLayoutManager(this))

        val adapter = CategoriesRVAdapter(categoriesModalArrayList!!, this)
        catRV.setAdapter(adapter)

        val b2=findViewById<ImageButton>(com.example.myapplication.R.id.filter)
        b2.setOnClickListener(this)
    }
    @Override
    override fun onClick(v: View?) {

        if (v != null) {
            showPopupMenu(v)
        };

    }
    private fun showPopupMenu(v: View) {
        val popupMenu = PopupMenu(this, v)
        popupMenu.inflate(com.example.myapplication.R.menu.popupmenu)
        popupMenu
            .setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    com.example.myapplication.R.id.menu1 -> {

                        true
                    }
                    com.example.myapplication.R.id.menu2 -> {

                        true
                    }
                    com.example.myapplication.R.id.menu3 -> {

                        true
                    }
                    else -> false
                }
            }
        popupMenu.setOnDismissListener {
            Toast.makeText(
                applicationContext, "onDismiss",
                Toast.LENGTH_SHORT
            ).show()
        }
        popupMenu.show()
    }

}