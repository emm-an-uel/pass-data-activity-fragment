package com.example.senddatafromactivitytofragment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val person = Person("John", "30", "Male")

        val fragment2 = Fragment2()
        val bundle = Bundle()
        bundle.putParcelable("person", person)
        fragment2.arguments = bundle

        supportFragmentManager.beginTransaction().replace(R.id.frameLayout2, fragment2).commit()
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout1, Fragment1()).commit()
    }

}