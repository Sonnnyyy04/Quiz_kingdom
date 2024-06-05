package com.example.quiz_kingdom.presentation.play_by_code

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
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
        insertCodeFromEditTextCode()
        return binding.root
    }
    fun insertCodeFromEditTextCode() {
        binding.code.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                val temp = binding.code.text.toString()
                if (temp.length == 6) {
                    binding.symbol1.text = temp[0].toString()
                    binding.symbol2.text = temp[1].toString()
                    binding.symbol3.text = temp[2].toString()
                    binding.symbol4.text = temp[3].toString()
                    binding.symbol5.text = temp[4].toString()
                    binding.symbol6.text = temp[5].toString()
                    // Закрытие клавиатуры
                    val imm =
                        context?.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
                    imm?.hideSoftInputFromWindow(view?.windowToken, 0)
                } else {
                    Toast.makeText(context, "Код должен содержать 6 символов", Toast.LENGTH_SHORT)
                        .show()
                }
                true
            } else {
                false
            }
        }
    }
}