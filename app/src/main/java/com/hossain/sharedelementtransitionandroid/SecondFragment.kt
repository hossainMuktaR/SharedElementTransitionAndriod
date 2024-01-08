package com.hossain.sharedelementtransitionandroid

import android.os.Bundle
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment

class SecondFragment: Fragment(R.layout.fragment_second) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //define transition name all shared element in xml file
        //set how share element transition happen
        val transition = TransitionInflater.from(requireContext())
            .inflateTransition(android.R.transition.move)
        sharedElementEnterTransition = transition
        sharedElementReturnTransition = transition
    }
}