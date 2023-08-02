package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        // binding.root returns the root layout,
        // which is activity_main.xml file itself
        setContentView(binding.root)
        binding.submitBtn.setOnClickListener {
            val str : String = binding.enterEt.text.toString()
            if (str.isNotEmpty()) {
                Toast.makeText(
                    this,
                    "You entered " + binding.enterEt.text.toString(),
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(this,
                "Please enter something",
                Toast.LENGTH_SHORT).show()
            }
        }
    }
}