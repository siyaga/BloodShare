package com.latihan2.bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class CheckEmailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_email)
        val buttonCheckEmail : Button = findViewById(R.id.btn_check_email)
        val intent = intent;
        val username = intent.getStringExtra("username")
        val blood = intent.getStringExtra("blood")
        //Intent menuju verifiyemail
        buttonCheckEmail.setOnClickListener(View.OnClickListener {
            val intentCheckEmail : Intent = Intent(this@CheckEmailActivity,VerifiyEmailActivity::class.java)
            val us  = username
            val bl  = blood
            intentCheckEmail.putExtra("username",us)
            intentCheckEmail.putExtra("blood",bl)
            startActivity(intentCheckEmail)

        })
    }
}
