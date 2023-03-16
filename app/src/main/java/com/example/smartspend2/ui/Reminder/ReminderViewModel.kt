package com.example.smartspend2.ui.Reminder

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReminderViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Reminders Fragment"
    }
    val text: LiveData<String> = _text
}