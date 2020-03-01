package com.example.markdown

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class Choose: Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.choose_fragment, container, false)

        root.findViewById<Button>(R.id.falnatsheh).setOnClickListener(this)
        root.findViewById<Button>(R.id.mukeshsolanki).setOnClickListener(this)
        root.findViewById<Button>(R.id.mittsuu).setOnClickListener(this)
        root.findViewById<Button>(R.id.Gunio).setOnClickListener(this)

        return root
    }

    override fun onClick(p0: View?) {
        when(p0!!.id) {
            R.id.falnatsheh -> (activity as MainActivity).startFragment(Falnatsheh(), "Falnatesh")

            R.id.mukeshsolanki -> (activity as MainActivity).startFragment(Mukesh(), "Mukesh")

            R.id.mittsuu -> (activity as MainActivity).startFragment(Mittsu(), "Mittsu")

            R.id.Gunio -> {}
        }
    }
}