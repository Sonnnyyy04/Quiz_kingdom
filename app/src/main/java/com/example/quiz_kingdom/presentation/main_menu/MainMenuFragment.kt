package com.example.quiz_kingdom.presentation.main_menu

import android.animation.Animator
import android.animation.Animator.AnimatorListener
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.quiz_kingdom.R
import com.example.quiz_kingdom.databinding.FragmentMainMenuBinding
import com.example.quiz_kingdom.databinding.FragmentStartScreenBinding


class MainMenuFragment : Fragment() {
    lateinit var binding: FragmentMainMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainMenuBinding.inflate(inflater,container,false)
        return binding.root
    }

}