package com.example.composedaggerhilttest1

import androidx.lifecycle.ViewModel
import com.example.composedaggerhilttest1.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(private val repository: MyRepository): ViewModel() {
}