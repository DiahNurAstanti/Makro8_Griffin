package com.example.makrokel8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class datadiri_Activity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datadiri)

        val btn_next : Button = findViewById(R.id.btn_next)
        btn_next.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_next -> {

                val intent = Intent(this@datadiri_Activity, register_Activity::class.java)


                startActivity(intent)
            }
        }
    }
}
