package com.example.baper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var detail1 : Button
    private lateinit var detail2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        detail1 = findViewById(R.id.detail1)
        detail1.setOnClickListener(this)
        detail2 = findViewById(R.id.detail2)
        detail2.setOnClickListener(this)
    }
    override fun onClick(v: View){
        when(v.id){
            R.id.detail1 ->{
                val intentBiasa = Intent(this@MainActivity, detailmenu1::class.java)
                startActivity(intentBiasa)

            }
        }
        when(v.id){
            R.id.detail2->{
                val intentBiasa2 = Intent(this@MainActivity, detailmenu2::class.java)
                startActivity(intentBiasa2)
            }
        }
    }
}
