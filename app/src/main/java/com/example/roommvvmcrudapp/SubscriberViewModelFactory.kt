package com.example.roommvvmcrudapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.roommvvmcrudapp.db.SubscriberRepository

abstract class SubscriberViewModelFactory(
    private val repository: SubscriberRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SubscriberViewModel::class.java)) {
            return SubscriberViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown View Model class")
    }

}
