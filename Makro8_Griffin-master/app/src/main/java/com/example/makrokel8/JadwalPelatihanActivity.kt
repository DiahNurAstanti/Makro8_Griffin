package com.example.makrokel8

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class JadwalPelatihanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jadwal_pelatihan)

        val btn_back1 = findViewById<ImageButton>(R.id.back1)
        val btn_pelatihan = findViewById<ImageButton>(R.id.icon_chart_)

        btn_back1.setOnClickListener {
            val intent = Intent(this, PelatihanActivity::class.java)
            startActivity(intent)
        }


        btn_pelatihan.setOnClickListener {
            val intent = Intent(this, PelatihanActivity::class.java)
            startActivity(intent)
        }
    }
}