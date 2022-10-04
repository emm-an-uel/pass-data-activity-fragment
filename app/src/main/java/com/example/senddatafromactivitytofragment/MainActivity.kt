package com.example.senddatafromactivitytofragment

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var sendText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        sendText = findViewById(R.id.editText)

        button.setOnClickListener() {
            val fragment = FirstFragment()
            val bundle = Bundle()
            bundle.putString("string", sendText.text.toString())
            fragment.arguments = bundle
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment)
                .commit()
        }
    }
}