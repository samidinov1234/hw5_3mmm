package com.example.hw5_3mm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw5_3mm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.container, FirstFragment()).commit()
    }
}