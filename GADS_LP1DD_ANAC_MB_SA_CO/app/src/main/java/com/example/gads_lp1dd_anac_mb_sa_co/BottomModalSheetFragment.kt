package com.example.gads_lp1dd_anac_mb_sa_co

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gads_lp1dd_anac_mb_sa_co.databinding.FragmentBottomModalSheetBinding
import com.example.gads_lp1dd_anac_mb_sa_co.databinding.FragmentSecondBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class BottomModalSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentBottomModalSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBottomModalSheetBinding.inflate(inflater, container, false)

       return binding.root
    }

}