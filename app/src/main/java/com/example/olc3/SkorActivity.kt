package com.example.olc3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_skor.*

class SkorActivity : AppCompatActivity() {

    private lateinit var namaA: String
    private lateinit var namaB: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skor)

        val bundle = intent.extras
        if (bundle != null) {
            namaA = intent.getStringExtra("namaA")
            namaB = intent.getStringExtra("namaB")

            tv_timA.text = namaA
            tv_timB.text = namaB
        }
    }
}


