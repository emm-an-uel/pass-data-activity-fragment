package com.example.senddatafromactivitytofragment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var etName: EditText
    lateinit var etAge: EditText
    lateinit var etGender: EditText
    lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.etName)
        etAge = findViewById(R.id.etAge)
        etGender = findViewById(R.id.etGender)
        btnSend = findViewById(R.id.btnSend)

        btnSend.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("name", etName.text.toString())
            val displayDataFragment = DisplayDataFragment()
            displayDataFragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, displayDataFragment)
                .commit()
        }
    }

}