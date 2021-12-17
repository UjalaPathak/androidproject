package com.example.myapplication.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.navigation.Navigation
import com.example.myapplication.R



class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=  inflater.inflate(R.layout.fragment_profile, container, false)
        view.findViewById<TextView>(R.id.change_mail).setOnClickListener()
        {
            Navigation.findNavController(view).navigate(R.id.changemailFragment)
        }

        view.findViewById<TextView>(R.id.login_history).setOnClickListener()
        {
            Navigation.findNavController(view).navigate(R.id.loginHistoryFragment)
        }
        view.findViewById<TextView>(R.id.logout).setOnClickListener()
        {
            Navigation.findNavController(view).navigate(R.id.logOutFragment)
        }
        view.findViewById<TextView>(R.id.deletebutton).setOnClickListener()
        {
            Navigation.findNavController(view).navigate(R.id.deleteMyAccountragment)
        }


          return view
    }


}