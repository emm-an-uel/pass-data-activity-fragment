package com.example.senddatafromactivitytofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var tvId: TextView
    lateinit var tvName: TextView
    lateinit var tvRoll: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvId = findViewById(R.id.tvId)
        tvName = findViewById(R.id.tvName)
        tvRoll = findViewById(R.id.tvRoll)

        val bundle = intent.extras
        if (bundle != null) {
            tvId.text = "name = ${bundle.getString("id")}"
            tvName.text = "age = ${bundle.getString("name")}"
            tvRoll.text = "gender = ${bundle.getString("roll")}"
        }
    }
}