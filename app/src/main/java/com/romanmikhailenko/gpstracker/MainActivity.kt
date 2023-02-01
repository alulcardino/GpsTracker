package com.romanmikhailenko.gpstracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.romanmikhailenko.gpstracker.databinding.ActivityMainBinding
import com.romanmikhailenko.gpstracker.fragments.MainFragment
import com.romanmikhailenko.gpstracker.fragments.SettingsFragment
import com.romanmikhailenko.gpstracker.fragments.TracksFragment
import com.romanmikhailenko.gpstracker.utils.openFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onBottomNavClicks()
        openFragment(MainFragment.newInstance())
    }

    private fun onBottomNavClicks(){
        binding.bNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.id_home -> openFragment(MainFragment.newInstance())
                R.id.id_tracks -> openFragment(TracksFragment.newInstance())
                R.id.id_settings -> openFragment(SettingsFragment())
            }
            true
        }
    }
}