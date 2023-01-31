package com.romanmikhailenko.gpstracker

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.romanmikhailenko.gpstracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onBottomNavClicks()
    }

    private fun onBottomNavClicks(){
        binding.bNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.id_home -> Toast.makeText(this, "1", Toast.LENGTH_LONG).show()
                R.id.id_tracks -> Toast.makeText(this, "2", Toast.LENGTH_LONG).show()
                R.id.id_settings -> Toast.makeText(this, "3", Toast.LENGTH_LONG).show()
            }
            true
        }
    }
}