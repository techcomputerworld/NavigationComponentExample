package com.techcomputerworld.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.techcomputerworld.navigationcomponentexample.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root:View = inflater.inflate(R.layout.fragment_first, container, false)
        val btnNavigate : Button = root.findViewById<Button>(R.id.btnNavigate)
        /* tengo que navegar a un fragment, pero en realidad lo que estamos haciendo es ejecutar una accion
           que es dame el controlador de navegacion y dame el navegar a tal fragment
         */
        btnNavigate.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
            //esto si añadiera la libreria para funcionar con safeargs pues funcionaria
            // it is add library safeargs run the action.
            //.findNavController().navigate(FirstFragmentDirections)
        }
        return root
    }

}