package com.loveon.getonup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.loveon.getonup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,  R.layout.activity_main)


        binding.navigation.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.navigation_alarm -> {

                    true
                }
                R.id.navigation_list -> {
                    // Respond to navigation item 2 click
                    true
                }
                else -> false
            }
        }
    }
}