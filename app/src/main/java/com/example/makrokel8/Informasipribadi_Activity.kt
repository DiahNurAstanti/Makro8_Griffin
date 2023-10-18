package com.example.makrokel8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Informasipribadi_Activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasipribadi)

        findViewById<ImageView>(R.id.bck).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.bck -> {
                val intent = Intent(this@Informasipribadi_Activity, homeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}