package com.example.makrokel8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class loginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var et_username : EditText
    private lateinit var et_password : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        et_username =findViewById(R.id.et_username)
        et_password =findViewById(R.id.et_password1)

        val bundle = intent.extras

        if (bundle != null) {
            et_username.setText(bundle.getString("username"))
            et_password.setText(bundle.getString("password"))
        }

        val btn_login : Button = findViewById(R.id.btn_login1)
        btn_login.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_login1 -> {
                val bundle = Bundle()
                bundle.putString("username", et_username.text.toString())
                bundle.putString("password", et_password.text.toString())


                val intent = Intent(this@loginActivity, homeActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}