package com.romanmikhailenko.gpstracker.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.romanmikhailenko.gpstracker.R
import com.romanmikhailenko.gpstracker.databinding.FragmentTracksBinding
import com.romanmikhailenko.gpstracker.databinding.FragmentViewTrackBinding

class TracksFragment : Fragment() {
    private lateinit var binding: FragmentTracksBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTracksBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance() =
            TracksFragment()
    }


}