package com.example.markdown

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.tiagohm.markdownview.MarkdownView
import br.tiagohm.markdownview.css.styles.Github


class Tiagohm: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.tiagohm_fragment, container, false)

        val mMarkdownView = root.findViewById<MarkdownView>(R.id.markdown_view)
        mMarkdownView.addStyleSheet(Github())

//        mMarkdownView.loadMarkdownFromAsset("anithink.md")
        mMarkdownView.loadMarkdownFromUrl("https://raw.githubusercontent.com/HoncharukOleksandr/markdown/master/README.md")

        return root
    }
}