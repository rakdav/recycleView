package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(),CellClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recView=findViewById<RecyclerView>(R.id.listCountries)
        recView.layoutManager=LinearLayoutManager(this)
        var data=ArrayList<ItemsViewModel>()
        data.add(ItemsViewModel("Аргентина","Буэнос-Айрос",R.drawable.argentina))
        data.add(ItemsViewModel("Бразилия","Бразилиа",R.drawable.brazl))
        data.add(ItemsViewModel("Чили","Сантьяго",R.drawable.flag_of_chile))
        data.add(ItemsViewModel("Уругвай","Монтевидео",R.drawable.urugvai))
        data.add(ItemsViewModel("Колумбия","Богота",R.drawable.co))
        val adapter=CountryAdapter(data,this)
        recView.adapter=adapter
    }

    override fun onCellClickListener(data: ItemsViewModel) {
        Toast.makeText(this,"${data.country} ${data.capital}",Toast.LENGTH_SHORT).show()
    }


}