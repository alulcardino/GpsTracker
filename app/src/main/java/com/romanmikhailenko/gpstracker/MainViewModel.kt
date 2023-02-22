package com.romanmikhailenko.gpstracker

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.romanmikhailenko.gpstracker.location.LocationModel

class MainViewModel : ViewModel() {
    val locationUpdates = MutableLiveData<LocationModel>()
    val timeData = MutableLiveData<String>()

}