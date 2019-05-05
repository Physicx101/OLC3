package com.example.olc3

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_list.view.*

class MobilAdapter(val list: List<Mobil>) : RecyclerView.Adapter<MobilAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val namaMobil = view.nama_mobil
        val hargaMobil = view.harga_mobil
        val warnaMobil = view.warna_mobil

        fun bind(data: Mobil) {
            namaMobil.text = data.merk
            hargaMobil.text = data.harga
            warnaMobil.text = data.warna
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MobilAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MobilAdapter.ViewHolder, position: Int) {
        holder.bind(list[position])
    }
}