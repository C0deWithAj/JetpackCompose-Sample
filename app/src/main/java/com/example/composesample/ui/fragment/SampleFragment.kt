package com.example.composesample.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Text
import androidx.compose.ui.platform.ComposeView
import com.example.composesample.R

class SampleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val composeView = ComposeView(requireContext())
        composeView.apply {
            setContent {
                Text(text = "compose inside Fragment")
            }

        }
        return composeView
    }

}