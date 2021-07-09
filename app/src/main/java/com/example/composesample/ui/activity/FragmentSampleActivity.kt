package com.example.composesample.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.composesample.R
import com.example.composesample.ui.fragment.SampleFragment

class FragmentSampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_sample)
        supportFragmentManager.beginTransaction()
            .replace(R.id.root_container, SampleFragment())
            .commitAllowingStateLoss()
    }
    
}