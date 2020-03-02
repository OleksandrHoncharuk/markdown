package com.example.markdown

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import us.feras.mdv.MarkdownView

class Falnatsheh: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.falnatsheh_fragment, container, false)

        val markdownView = root.findViewById<MarkdownView>(R.id.markdown_view)
//        markdownView.loadMarkdownFile("file:///android_asset/anithink.md")
        markdownView.loadMarkdownFile("https://raw.githubusercontent.com/HoncharukOleksandr/markdown/master/README.md")

        return root
    }
}