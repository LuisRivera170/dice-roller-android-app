package com.lara.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.lara.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rollBtn.text = "Let's Roll"

        binding.rollBtn.setOnClickListener {
            Toast
                .makeText(this,"Roll clicked", Toast.LENGTH_LONG)
                .show()
        }
    }



}