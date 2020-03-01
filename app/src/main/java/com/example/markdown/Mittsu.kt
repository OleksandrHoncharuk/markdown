package com.example.markdown

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mittsu.markedview.MarkedView

class Mittsu: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.mittsu_fragment, container, false)

        val mdView = root.findViewById<MarkedView>(R.id.markdown_view)

        mdView.loadMDFilePath("https://drive.google.com/open?id=109qFCHKiwCGllzqiuTrmHLbHOPuFZT8M")

        mdView.setCodeScrollDisable()

        return root
    }
}