package com.example.makrokel8

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class PelatihanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pelatihan)


        val  btn_pilihkelas = findViewById<ImageButton>(R.id.img_kelas)

        btn_pilihkelas.setOnClickListener {
            val intent = Intent(this, DetailPelatihanActivity::class.java)
            startActivity(intent)
        }


    }
}