package com.romanmikhailenko.gpstracker.fragments

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.preference.Preference
import androidx.preference.Preference.OnPreferenceChangeListener
import androidx.preference.PreferenceFragmentCompat
import com.romanmikhailenko.gpstracker.R

class SettingsFragment : PreferenceFragmentCompat() {
    private lateinit var timePref: Preference
    private lateinit var colorPref: Preference

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.main_preference, rootKey)
        init()
    }

    private fun init() {
        timePref = findPreference("update_time_key")!!
        colorPref = findPreference("color_key")!!
        val changeListener = onChangeListener()
        timePref.onPreferenceChangeListener = changeListener
        colorPref.onPreferenceChangeListener = changeListener

        initPrefs()
    }

    private fun onChangeListener() : OnPreferenceChangeListener {
        return Preference.OnPreferenceChangeListener {
            preference, newValue ->
                when (preference.key) {
                    "update_time_key" -> onTimeChange(newValue.toString())
                    "color_key" -> onColorChange(newValue.toString())
                }
            true
        }
    }

    private fun onTimeChange(newValue: String) {
        val nameArray = resources.getStringArray(R.array.loc_time_update_name)
        val valueArray = resources.getStringArray(R.array.loc_time_update_value)
        timePref.title = "${timePref.title.toString().substringBefore(":")}: ${nameArray[valueArray.indexOf(newValue )]}"
    }

    private fun onColorChange(newValue: String) {
        colorPref.icon?.setTint(Color.parseColor(newValue))
    }

    private fun initPrefs(){

        val nameArray = resources.getStringArray(R.array.loc_time_update_name)
        val valueArray = resources.getStringArray(R.array.loc_time_update_value)
        timePref.title = "${timePref.title.toString()}: ${nameArray[valueArray.indexOf(timePref.preferenceManager.sharedPreferences?.getString("update_time_key", "3000"))]}"

        val color = colorPref.preferenceManager.sharedPreferences?.getString("color_key", "#FF009EDA")
        colorPref.icon?.setTint(Color.parseColor(color))
    }
}