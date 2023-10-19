package com.example.makrokel8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class DetailPelatihanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pelatihan)
    }

    val btn_backdetail: ImageButton = findViewById<ImageButton>(R.id.back_detail)
    val btn_deskripsi: Button = findViewById<Button>(R.id.btn_deskripsi)

    btn_deskripsi.setOnCliclkListener{
        val intent = Intent (this, JadwalPelatihanActivity::class.java)
        startActivity(intent)
    }

    btn_backdetail.setOnClickListener {
        val intent = Intent ( this, PelatihanActivity::class.java)
        startActivity()
    }

}