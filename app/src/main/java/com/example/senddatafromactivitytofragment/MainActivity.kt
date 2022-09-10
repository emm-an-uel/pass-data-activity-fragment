package com.example.senddatafromactivitytofragment

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val myString = "hello"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val btn = findViewById<Button>(R.id.button)

        // Declaring fragment manager from making data
        // transactions using the custom fragment
        val mFragmentManager = supportFragmentManager
        val mFragmentTransaction = mFragmentManager.beginTransaction()
        val mFragment = FirstFragment()

        btn.setOnClickListener() {
            val myString = editText.text.toString()
            mFragmentTransaction.add(R.id.frameLayout, mFragment).commit()
        }
    }

    fun getMyData(): String {
        return myString
    }
}