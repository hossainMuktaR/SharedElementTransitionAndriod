package com.hossain.sharedelementtransitionandroid

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController

class FirstFragment: Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //also set shared element transition name in xml file
        //get the shared element and pass with second fragment transition name in navigate time with extras
        val birdImageSmall = view.findViewById<ImageView>(R.id.birdImage)
        val userName = view.findViewById<TextView>(R.id.userName)
        birdImageSmall.setOnClickListener{
            val extras = FragmentNavigatorExtras(
                birdImageSmall to "birdimagebig",
                userName to "usernamebig"
            )
            findNavController().navigate(
                R.id.action_firstFragment_to_secondFragment,
                null,
                null,
                extras
            )
        }
    }
}