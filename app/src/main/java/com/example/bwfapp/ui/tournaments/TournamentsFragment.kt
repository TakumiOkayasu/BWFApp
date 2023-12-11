package com.example.bwfapp.ui.tournaments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.bwfapp.databinding.FragmentTournamentsBinding

class TournamentsFragment : Fragment() {

    private var _binding: FragmentTournamentsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val tournamentsViewModel =
            ViewModelProvider(this)[TournamentsViewModel::class.java]

        _binding = FragmentTournamentsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}