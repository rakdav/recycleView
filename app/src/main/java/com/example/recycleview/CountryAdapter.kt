package com.example.recycleview

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CountryAdapter(private val countries:List<ItemsViewModel>):
    RecyclerView.Adapter<CountryAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).
                inflate(R.layout.country_list_item,parent,false)
        return ViewHolder(view);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel=countries[position]
        holder.country.text=ItemsViewModel.country
        holder.capital.text=ItemsViewModel.capital
        holder.flag.setImageResource(ItemsViewModel.flag)
    }

    override fun getItemCount(): Int {
        return countries.size
    }
    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView)
    {
        val country:TextView=ItemView.findViewById(R.id.country)
        val capital:TextView=ItemView.findViewById(R.id.capital)
        val flag:ImageView=ItemView.findViewById(R.id.flag)
    }
}