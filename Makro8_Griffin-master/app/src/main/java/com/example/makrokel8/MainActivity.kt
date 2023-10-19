package com.example.makrokel8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_login : Button = findViewById(R.id.btn_login)
        val btn_register : Button = findViewById(R.id.btn_register)
        btn_login.setOnClickListener(this)
        btn_register.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_login -> {
                val intent = Intent(this@MainActivity, loginActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_register -> {
                val intent = Intent(this@MainActivity, datadiri_Activity::class.java)
                startActivity(intent)
            }
        }
    }
}

