package com.romanmikhailenko.gpstracker.utils

import android.content.Context
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.romanmikhailenko.gpstracker.R

fun Fragment.openFragment(fragment: Fragment) {
    (activity as AppCompatActivity).supportFragmentManager
        .beginTransaction().setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
        .replace(R.id.placeHolder, fragment).commit()
}

fun AppCompatActivity.openFragment(fragment: Fragment) {
    if (supportFragmentManager.fragments.isNotEmpty()) {
        if (supportFragmentManager.fragments[0].javaClass == fragment.javaClass) return
    }
    supportFragmentManager
        .beginTransaction().setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        .replace(R.id.placeHolder, fragment).commit()
}

fun Fragment.checkPermission(string: String): Boolean {
    return when(PackageManager.PERMISSION_GRANTED) {
        ContextCompat.checkSelfPermission((activity as AppCompatActivity), string) -> true
        else -> false
    }
}