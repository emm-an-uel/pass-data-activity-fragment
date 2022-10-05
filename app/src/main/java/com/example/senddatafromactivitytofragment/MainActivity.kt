package com.example.senddatafromactivitytofragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var etName: EditText
    lateinit var etAge: EditText
    lateinit var etGender: EditText
    lateinit var btnSave: Button
    lateinit var btnSend: Button
    lateinit var listPerson: ArrayList<Person>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.etName)
        etAge = findViewById(R.id.etAge)
        etGender = findViewById(R.id.etGender)
        btnSave = findViewById(R.id.btnSave)
        btnSend = findViewById(R.id.btnSend)
        listPerson = ArrayList()

        btnSave.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString()
            val gender = etGender.text.toString()

            val person = Person(name, age, gender)
            listPerson.add(person)

            // val listSize = listPerson.size
            // Log.i("listSize", listSize.toString())
        }

        btnSend.setOnClickListener {

            val bundle = Bundle()
            bundle.putParcelableArrayList("listPerson", listPerson)
            val displayDataFragment = DisplayDataFragment()
            displayDataFragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, displayDataFragment)
                .commit()
        }
    }

}