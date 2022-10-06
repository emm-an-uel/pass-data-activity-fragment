package com.example.senddatafromactivitytofragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.setFragmentResultListener

class Fragment1 : Fragment() {

    lateinit var person: Person

    lateinit var tvName: TextView
    lateinit var tvAge: TextView
    lateinit var tvGender: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setFragmentResultListener("personKey") {requestKey, bundle ->
            person = bundle.getParcelable("person")!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvName = view.findViewById(R.id.tvName)
        tvAge = view.findViewById(R.id.tvAge)
        tvGender = view.findViewById(R.id.tvGender)

        tvName.text = person.name
        tvAge.text = person.age
        tvGender.text = person.gender
    }
}