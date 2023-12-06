package com.example.bwfapp.ui.tournaments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TournamentsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is tournaments Fragment"
    }
    val text: LiveData<String> = _text
}