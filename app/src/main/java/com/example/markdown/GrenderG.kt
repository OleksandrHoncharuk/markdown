package com.example.markdown

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import es.dmoral.markdownview.MarkdownView

class GrenderG: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.grenderg_fragment, container, false)

        val mdView = root.findViewById<MarkdownView>(R.id.markdown_view)

//        mdView.loadFromAssets("anithink.md")
        mdView.loadFromUrl("https://raw.githubusercontent.com/HoncharukOleksandr/markdown/master/README.md")

        return root
    }
}