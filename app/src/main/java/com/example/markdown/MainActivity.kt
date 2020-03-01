package com.example.markdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container, Choose()).commit()
    }

    fun startFragment(f: Fragment, tag: String) {
        supportFragmentManager.beginTransaction().add(R.id.container, f).addToBackStack(tag).commit()
    }

}
