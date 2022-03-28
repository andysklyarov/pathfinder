package com.andysklyarov.pathfinder.ui.compass

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import pathfinder.R
import pathfinder.databinding.FragmentCompassBinding

class CompassFragment : Fragment() {

    private var _binding: FragmentCompassBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(CompassViewModel::class.java)

        _binding = FragmentCompassBinding.inflate(inflater, container, false)

        binding.btnSettings.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_navigation_settings)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
