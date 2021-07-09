package com.example.composesample.custom

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.appcompat.widget.AppCompatTextView

@SuppressLint("ResourceAsColor")
class CustomTextView @JvmOverloads constructor(
    context: Context,
    txt: String,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    init {
        layoutParams = ViewGroup.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
        text = txt
        textSize = 20f
        gravity = Gravity.CENTER
//        setTextColor(android.R.color.holo_purple)
    }

}