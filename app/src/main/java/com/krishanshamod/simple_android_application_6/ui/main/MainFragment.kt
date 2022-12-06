package com.krishanshamod.simple_android_application_6.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.krishanshamod.simple_android_application_6.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // Get the TextView from the layout
        var countText = view?.findViewById<TextView>(R.id.textCount)

        // Observe the count LiveData
        viewModel.count.observe(viewLifecycleOwner) {
            countText?.text = it.toString()
        }

        // Get the Button from the layout
        var countButton = view?.findViewById<Button>(R.id.buttonCount)

        // Increment the count
        countButton?.setOnClickListener {
            viewModel.incrementCount()
        }

    }

}