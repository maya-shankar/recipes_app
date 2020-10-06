package com.example.recipesv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.recipesv2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // binding.navHostFragment.nav
        binding = ActivityMainBinding.inflate(layoutInflater)
        // navController = findNavController(R.id.nav_host_fragment)
        setContentView(binding.root)
    }
}