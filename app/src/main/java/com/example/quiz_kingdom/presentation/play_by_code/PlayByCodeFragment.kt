package com.example.quiz_kingdom.presentation.play_by_code

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.quiz_kingdom.R
import com.example.quiz_kingdom.databinding.FragmentPlayByCodeBinding
import com.example.quiz_kingdom.databinding.FragmentStartScreenBinding


class PlayByCodeFragment : Fragment() {
    lateinit var binding: FragmentPlayByCodeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlayByCodeBinding.inflate(inflater,container,false)
        return binding.root
    }


}