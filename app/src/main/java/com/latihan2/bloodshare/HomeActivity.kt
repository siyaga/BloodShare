package com.latihan2.bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.OnBackPressedCallback

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        //Intent get data
        val intent = intent;
        val user = intent.getStringExtra("username")
        val blo = intent.getStringExtra("blood")

        val tvUsername = findViewById<TextView>(R.id.tv_name_profil)
        val spinnerBlood = findViewById<TextView>(R.id.tv_blood_profil)
        tvUsername.text = user
        spinnerBlood.text = "Blood type : "+blo


    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()

    }
}

/*
Tanggal Pengerjaan : 16 April 2020
Deskripsi : Membuat awal project (homeactivity, check email)

Tanggal Pengerjaan : 17 April 2020
Deskripsi : Membuat login, regisgter dan verivy email)

NIM : 10117157
NAMA : ANANDA MARWANAYA PUTRA
KELAS : IF-4

 */
