package com.example.makrokel8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Document_Activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_document)

        findViewById<ImageView>(R.id.bck_2).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.bck_2 -> {
                val intent = Intent(this@Document_Activity, homeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}