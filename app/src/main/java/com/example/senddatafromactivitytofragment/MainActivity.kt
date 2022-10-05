package com.example.senddatafromactivitytofragment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var etId: EditText
    lateinit var etName: EditText
    lateinit var etRoll: EditText
    lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etId = findViewById(R.id.etId)
        etName = findViewById(R.id.etName)
        etRoll = findViewById(R.id.etRoll)
        btnSend = findViewById(R.id.btnSend)

        btnSend.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("id", etId.text.toString())
            val displayDataFragment = DisplayDataFragment()
            displayDataFragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, displayDataFragment)
                .commit()
        }
    }

}