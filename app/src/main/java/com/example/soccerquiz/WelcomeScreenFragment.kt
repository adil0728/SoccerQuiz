package com.example.soccerquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.soccerquiz.databinding.ActivityMainBinding
import com.example.soccerquiz.databinding.FragmentWelcomeScreenBinding

class WelcomeScreenFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentWelcomeScreenBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_welcome_screen, container, false
        )

        binding.letsPlayBtn.setOnClickListener{view: View ->
            Navigation.findNavController(view).navigate(R.id.action_welcomeScreenFragment_to_quizFragment)
        }

        (activity as AppCompatActivity).supportActionBar?.title = "Soccer Quiz"

        return binding.root
    }
}