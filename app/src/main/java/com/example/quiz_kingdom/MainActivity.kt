package com.example.quiz_kingdom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quiz_kingdom.databinding.ActivityMainBinding
import com.example.quiz_kingdom.presentation.main_menu.MainMenuFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.palce_holder, MainMenuFragment())
            .commit()
    }
}