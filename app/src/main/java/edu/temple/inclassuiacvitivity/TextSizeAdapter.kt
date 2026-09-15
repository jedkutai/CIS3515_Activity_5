package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context: Context, _fontSizes: Array<Int>) : BaseAdapter() {

    private val context = _context
    private val fontSizes = _fontSizes

    override fun getCount(): Int {
        return fontSizes.size
    }

    override fun getItem(position: Int): Any {
        return fontSizes[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView: TextView
        if (convertView != null) {
            textView = convertView as TextView
        } else {
            textView = TextView(context)
        }

        textView.text = this.fontSizes[position].toString()
        textView.textSize = this.fontSizes[position].toFloat()
        textView.setPadding(5, 10, 0, 10)
        return textView
    }

}