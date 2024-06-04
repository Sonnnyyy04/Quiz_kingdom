package com.example.quiz_kingdom.presentation.start_screen

import android.animation.Animator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.quiz_kingdom.R
import com.example.quiz_kingdom.databinding.FragmentMainMenuBinding
import com.example.quiz_kingdom.databinding.FragmentStartScreenBinding


class StartScreenFragment : Fragment() {
    lateinit var binding: FragmentStartScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartScreenBinding.inflate(inflater,container,false)

        binding.animationView.addAnimatorListener(object  : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator) {
                //gogo
            }

            override fun onAnimationEnd(animation: Animator) {
                Navigation.findNavController(binding.root).navigate(R.id.action_startScreenFragment_to_mainMenuFragment)            }

            override fun onAnimationCancel(animation: Animator) {
                TODO("Not yet implemented")
            }

            override fun onAnimationRepeat(animation: Animator) {
                TODO("Not yet implemented")
            }


        })
        return  binding.root
    }
}