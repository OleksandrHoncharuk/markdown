package com.example.markdown

import android.Manifest
import android.content.pm.PackageManager
import android.os.AsyncTask
import android.os.Bundle
import android.os.Environment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.mittsu.markedview.MarkedView
import org.apache.commons.io.FileUtils
import java.io.File
import java.io.IOException
import java.lang.ref.WeakReference
import java.net.URL


class Mittsu: Fragment() {

    private lateinit var markedView: MarkedView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.mittsu_fragment, container, false)

        markedView = root.findViewById(R.id.markdown_view)

        if (ContextCompat.checkSelfPermission(activity!!,
                Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {

        } else {
            FileLoadingTask(this, File(Environment.getExternalStorageDirectory().path + "/Download/anithing.md"))
                .execute("https://raw.githubusercontent.com/HoncharukOleksandr/markdown/master/README.md")
        }

        return root
    }


    private class FileLoadingTask(parent: Mittsu, private var file: File): AsyncTask<String, Void?, Void?>() {
        private val parentRef: WeakReference<Mittsu> = WeakReference(parent)

        override fun doInBackground(vararg p0: String?): Void? {
             try {
                FileUtils.copyURLToFile(URL(p0[0]), file)
            } catch (e: IOException) {
                e.printStackTrace()
            }
            return null
        }

        override fun onPostExecute(aVoid: Void?) {
            super.onPostExecute(aVoid)
            parentRef.get()!!.markedView.loadMDFile(file)
        }
    }
}