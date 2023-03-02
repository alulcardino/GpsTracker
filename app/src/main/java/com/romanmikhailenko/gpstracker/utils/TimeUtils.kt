package com.romanmikhailenko.gpstracker.utils

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.TimeZone

object TimeUtils {
    @SuppressLint("SimpleDateFormat")
    private val timeFormatter = SimpleDateFormat("HH:mm:ss:SSS")
    @SuppressLint("SimpleDateFormat")
    private val dateFormatter = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")

    fun getTime(timeInMillis : Long): String {
        val cv = Calendar.getInstance()
        timeFormatter.timeZone = TimeZone.getTimeZone("UTC")
        cv.timeInMillis = timeInMillis
        return timeFormatter.format(cv.time)
    }

    fun getDate(): String {
        val cv = Calendar.getInstance()
        return dateFormatter.format(cv.time)
    }
}