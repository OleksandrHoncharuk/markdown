package com.example.markdown

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import us.feras.mdv.MarkdownView

class Falnatsheh: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.falnatsheh, container, false)

        val markdownView = root.findViewById<MarkdownView>(R.id.markdownView)
        markdownView.loadMarkdownFile("https://drive.google.com/open?id=109qFCHKiwCGllzqiuTrmHLbHOPuFZT8M")

        return root
    }
}