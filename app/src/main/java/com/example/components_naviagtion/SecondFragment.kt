package com.example.components_naviagtion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs


class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val tv = view.findViewById<TextView>(R.id.tvSec)
        val tv1 = view.findViewById<TextView>(R.id.textView)
        tv.text = arguments?.getString("name")
        tv1.text = arguments?.getInt("age").toString()
        return view
    }


}