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

        // Wrong way to update the UI

        // Get the TextView from the layout and set the text to the current count
        var countText = view?.findViewById<TextView>(R.id.textCount)
        countText?.text = viewModel.count.toString()

        // Get the Button from the layout and set the onClickListener to increment the count
        var countButton = view?.findViewById<Button>(R.id.buttonCount)

        // Increment the count and update the text
        countButton?.setOnClickListener {
            viewModel.incrementCount()
            countText?.text = viewModel.count.toString()
        }

    }

}