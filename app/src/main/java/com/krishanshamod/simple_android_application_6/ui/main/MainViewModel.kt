package com.krishanshamod.simple_android_application_6.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var _count = MutableLiveData<Int>().apply {
        value = 0
    }

    val count: LiveData<Int> = _count

    fun incrementCount() {
        _count.value = _count.value?.plus(1)
    }

}