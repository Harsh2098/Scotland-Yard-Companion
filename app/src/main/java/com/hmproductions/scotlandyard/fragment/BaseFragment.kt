package com.hmproductions.scotlandyard.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.hmproductions.scotlandyard.R
import kotlinx.android.synthetic.main.fragment_base.*

class BaseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_base, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mrXButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.mrx_action))
        detectiveButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.detective_action))
    }
}