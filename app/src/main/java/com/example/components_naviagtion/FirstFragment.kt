package com.example.components_naviagtion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController


class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view =  inflater.inflate(R.layout.fragment_first, container, false)
        view.findViewById<Button>(R.id.secondButton).setOnClickListener{
//            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(11, "Hello")
            view.findNavController().navigate(R.id.action_firstFragment2_to_secondFragment)
        }


        view.findViewById<Button>(R.id.secondFragment).setOnClickListener{view.findNavController().navigate(R.id.action_firstFragment2_to_thirdFragment)}

     return view
    }

}