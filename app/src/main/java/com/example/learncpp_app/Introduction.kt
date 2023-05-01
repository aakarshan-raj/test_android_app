package com.example.learncpp_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Introduction : Fragment() {

    lateinit var vieww: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        vieww =  inflater.inflate(R.layout.fragment_introduction, container, false)
        return vieww
    }


}