package com.latihan2.bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        val register : TextView = findViewById(R.id.tv_register)

        register.setOnClickListener(View.OnClickListener {
            val intent : Intent = Intent(this@Login, Register::class.java)
            startActivity(intent)
        })
    }
}
