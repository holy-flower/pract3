package com.example.pract3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstViewModel : ViewModel() {
    private val _someData = MutableLiveData<String>()
    val someData: LiveData<String> get() = _someData

    fun updateData(newData: String) {
        _someData.value = newData
    }
}