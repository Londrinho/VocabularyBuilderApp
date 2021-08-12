package com.jimmy.vocabularybuliderapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.firebase.ui.auth.AuthUI
import com.jimmy.vocabularybuliderapp.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.logoutBtn.setOnClickListener{ logOutOfApp() }
        binding.button.setOnClickListener { rollDice() }
    }
    //This is the function which randomly selects different vocabulary screens.
    fun rollDice(){
        val firstDice = Dice()
        val ranNumb = firstDice.rollTheDice()

        val drawableResource =  when (ranNumb){
            1 -> R.drawable.capricious
            2 -> R.drawable.cumulate
            3 -> R.drawable.egotist
            4 -> R.drawable.exonerate
            5 -> R.drawable.intoxicate
            6 -> R.drawable.maculated
            7 -> R.drawable.precocious
            8 -> R.drawable.vindicate
            9 -> R.drawable.perambulate
            10 -> R.drawable.etiquette
            11 -> R.drawable.susurrus
            12 -> R.drawable.incipient
            13 -> R.drawable.enormousness
            14 -> R.drawable.filial
            15 -> R.drawable.propitious
            16 -> R.drawable.nascent
            17 -> R.drawable.orgulous
            18 -> R.drawable.febrile
            19 -> R.drawable.risible
            20 -> R.drawable.normenclature
            21 -> R.drawable.solicitudeee
            22 -> R.drawable.scruple
            23 -> R.drawable.quota
            else -> R.drawable.capricious
        }

        binding.imageView.setImageResource(drawableResource)

        binding.imageView.contentDescription = ranNumb.toString()


    }
    //This is the class which has the function
    //which that produces random numbers used to select a random screen
    class Dice {

        fun rollTheDice(): Int {
            val ranNumBer = (0..23).random()
            return ranNumBer
        }
    }
    //This function logout the user and returns them to the home fragment
    fun logOutOfApp(): Unit {
        AuthUI.getInstance().signOut(requireContext())
        findNavController().navigate(R.id.action_mainFragment_to_introFragment)
    }


}