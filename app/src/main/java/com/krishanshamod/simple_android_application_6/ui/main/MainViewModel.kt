package com.krishanshamod.simple_android_application_6.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var _count = 0

    val count: Int
        get() = _count

    fun incrementCount() {
        _count++
    }

}