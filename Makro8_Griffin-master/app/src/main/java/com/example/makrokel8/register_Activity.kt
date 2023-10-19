package com.example.makrokel8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class register_Activity : AppCompatActivity(), View.OnClickListener {
    private lateinit var et_email : EditText
    private lateinit var et_password : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        et_email=findViewById(R.id.et_email)
        et_password =findViewById(R.id.et_password)

        val btn_register : Button = findViewById(R.id.btn_register1)
        btn_register.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_register1 -> {
                val bundle = Bundle()
                bundle.putString("username", et_email.text.toString())
                bundle.putString("password", et_password.text.toString())


                val intent = Intent(this@register_Activity, loginActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}