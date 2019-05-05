package com.example.olc3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class ListActivity : AppCompatActivity() {

    val mobilList: ArrayList<Mobil> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        //Membuat list mobil
        mobilList.add(Mobil("Ferrari", "1M", "Merah"))
        mobilList.add(Mobil("Toyota", "100jt", "Silver"))
        mobilList.add(Mobil("Honda", "200jt", "Hitam"))
        mobilList.add(Mobil("Lamborghini", "5M", "Kuning"))
        mobilList.add(Mobil("BMW", "500jt", "Biru"))


    }
}
