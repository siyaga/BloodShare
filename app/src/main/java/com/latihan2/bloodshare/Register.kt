package com.latihan2.bloodshare

import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Shader
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity


class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val edtName : EditText = findViewById(R.id.edt_username_register)
        val buttonRegister : Button = findViewById(R.id.btn_register)
        val spinnerBlood : Spinner = findViewById(R.id.spinner_blood_type)
        val spinnerReshus : Spinner = findViewById(R.id.spinner_reshus)
        val spinnerJob : Spinner = findViewById(R.id.spinner_job)

        // memasukan String array spinner 
        ArrayAdapter.createFromResource(
            this,
            R.array.spinner_blood_type,
            android.R.layout.simple_spinner_item
        ).also{
            adapter->
            adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
            spinnerBlood.adapter = adapter
        }

        //spinner
        ArrayAdapter.createFromResource(
            this,
            R.array.spinner_reshus,
            android.R.layout.simple_spinner_item
        ).also{
            adapter->
            adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
            spinnerReshus.adapter = adapter
        }
        ArrayAdapter.createFromResource(
            this,
            R.array.spinner_job,
            android.R.layout.simple_spinner_item
        ).also{
            adapter->
            adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
            spinnerJob.adapter = adapter
        }
        //Intent dari register menuju CheckEmail activity, dan mengirimkanm data username dan darah
        buttonRegister.setOnClickListener(View.OnClickListener {
            val intentRegister : Intent = Intent(this@Register, CheckEmailActivity::class.java)
            val username = edtName.text.toString()
            val blood = spinnerBlood.selectedItem.toString()
            intentRegister.putExtra("username",username)
            intentRegister.putExtra("blood",blood)


            startActivity(intentRegister)

        })

        supportActionBar!!.title = "Register"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}
