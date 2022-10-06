package com.example.senddatafromactivitytofragment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val person = Person("John", 30)

        supportFragmentManager.setFragmentResult("requestPerson", bundleOf("bundlePerson" to person))

        supportFragmentManager.beginTransaction().replace(R.id.frameLayout1, Fragment1()).commit()
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout2, Fragment2()).commit()
    }

}