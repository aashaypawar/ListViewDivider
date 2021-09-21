package org.geeksforgeeks.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mListView = findViewById<ListView>(R.id.list_view_1)
        val mList = arrayOf("One", "Two", "Three", "Four", "Five")
        mListView.adapter = ArrayAdapter(this, R.layout.list_item, R.id.item_text_view, mList)

        mListView.divider = null
    }
}