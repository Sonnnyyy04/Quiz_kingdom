package com.example.quiz_kingdom.presentation.game_mode

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.quiz_kingdom.R
import com.example.quiz_kingdom.databinding.FragmentChooseGameModeBinding
import com.example.quiz_kingdom.databinding.FragmentMainMenuBinding


class ChooseGameModeFragment : Fragment() {
    lateinit var binding: FragmentChooseGameModeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChooseGameModeBinding.inflate(inflater,container,false)
        binding.buttonByCode.setOnClickListener{
            Navigation.findNavController(binding.root).navigate(R.id.action_chooseGameModeFragment_to_playByCodeFragment)
        }

        return binding.root
    }


}