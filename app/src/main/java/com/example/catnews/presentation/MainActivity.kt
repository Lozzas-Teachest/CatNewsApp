package com.example.catnews.presentation

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.annotation.MainThread
import androidx.appcompat.app.AppCompatActivity
import com.example.catnews.R

class MainActivity : AppCompatActivity() {



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val button: Button = findViewById(R.id.launch_button)
        button.setOnClickListener{
            launchIndexActivity()
        }
    }

    private fun launchIndexActivity() {
        val intent = Intent(this, IndexActivity::class.java)
        this.startActivity(intent)
    }
}
