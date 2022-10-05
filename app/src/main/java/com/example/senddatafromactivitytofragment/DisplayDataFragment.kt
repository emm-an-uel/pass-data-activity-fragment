package com.example.senddatafromactivitytofragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView

class DisplayDataFragment : Fragment() {

    lateinit var tvName: TextView
    lateinit var tvAge: TextView
    lateinit var tvGender: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_display_data, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvName = view.findViewById(R.id.tvName)
        tvAge = view.findViewById(R.id.tvAge)
        tvGender = view.findViewById(R.id.tvGender)

        val bundle = arguments
        val listPerson: ArrayList<Person> = bundle!!.getParcelableArrayList("listPerson")!!
        //Log.i("listPerson", listPerson.toString())

        // find the latest addition to listPerson
        val lastPerson = listPerson[listPerson.size -1]
        val name = lastPerson.name
        val age = lastPerson.age
        val gender = lastPerson.gender

        tvName.text = name
        tvAge.text = age
        tvGender.text = gender
    }
}