package com.example.recycleview

data class ItemsViewModel(val country:String,val capital:String,val flag:Int){}

interface CellClickListener {
    fun onCellClickListener(data:ItemsViewModel)
}
