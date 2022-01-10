package com.groupb1.phonefreedom

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.annotation.RequiresApi
import androidx.navigation.Navigation
import com.groupb1.phonefreedom.sms.SendSMS

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {
    // TODO: Rename and change types of parameters

    val sendSMS = SendSMS()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP_MR1)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val activateButton = view.findViewById<ImageButton>(R.id.deactivateButton)
        activateButton.setOnClickListener {
            //Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_firstFragment)
            sendSMS.sendSMS("26636882", "noice")
        }

        return view
    }

}