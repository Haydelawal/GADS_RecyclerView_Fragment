package com.example.gads_path_daawk_module_3_coroutines

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.gads_path_daawk_module_3_coroutines.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        binding.button.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            findNavController().navigate(action)
        }



        return binding.root
    }

}