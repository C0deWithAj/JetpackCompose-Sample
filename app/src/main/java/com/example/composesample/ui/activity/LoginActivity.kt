package com.example.composesample.ui.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.example.composesample.R
import com.example.composesample.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addComposeView()
    }

    fun addComposeView() {
        binding.composeView.setContent {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Top
            ) {

                Spacer(modifier = Modifier.padding(10.dp))
                
                Button(onClick = {},modifier =  Modifier.align(Alignment.CenterHorizontally)) {
                    Text(text = "Login")
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Text(text = "No Login account? Create One",modifier = Modifier.align(Alignment.CenterHorizontally))

            }
        }

    }

}