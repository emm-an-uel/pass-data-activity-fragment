package com.example.senddatafromactivitytofragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentResultListener
import androidx.fragment.app.setFragmentResultListener
import org.w3c.dom.Text

class Fragment1 : Fragment() {

    lateinit var tvName: TextView
    lateinit var tvAge: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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

        setFragmentResultListener("requestPerson") { requestKey, bundle ->
            val person = bundle.getParcelable<Person>("bundlePerson")

            tvName.text = person!!.name
            tvAge.text = person.age.toString()
        }
    }
}