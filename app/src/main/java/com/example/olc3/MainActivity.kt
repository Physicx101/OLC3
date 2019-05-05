package com.example.olc3


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var namaA : String
    private lateinit var namaB: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_OK.setOnClickListener {
            namaA = et_timA.text.toString()
            namaB = et_timB.text.toString()

            val intent = Intent(this, SkorActivity::class.java)
            intent.putExtra("namaA", namaA)
            intent.putExtra("namaB", namaB)
            startActivity(intent)
        }

        button_list.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }


    }
}
