package com.example.backgroundtintissueapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.backgroundtintissueapp.databinding.ActivityMainBinding

class MainViewModel : ViewModel() {
    val backgroundColorLiveData = MutableLiveData<Int>(Color.RED)
}