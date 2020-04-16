package com.latihan2.bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class VerifiyEmailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifiy_email)

        val intent = intent;
        val username = intent.getStringExtra("username")
        val blood = intent.getStringExtra("blood")

        val buttonVerifiyEmail : Button = findViewById(R.id.btn_verifiy_email)
        buttonVerifiyEmail.setOnClickListener(View.OnClickListener {
            val intentVerifiyEmail : Intent = Intent(this@VerifiyEmailActivity,HomeActivity::class.java)
            val user = username
            val blo = blood
            intentVerifiyEmail.putExtra("username",user)
            intentVerifiyEmail.putExtra("blood",blo)
            startActivity(intentVerifiyEmail)
        })
    }
}
