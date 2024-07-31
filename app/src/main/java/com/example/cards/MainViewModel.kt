package com.example.cards

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _selectedCards: MutableLiveData<List<CardModel>> = MutableLiveData(emptyList())
    val selectedCards: LiveData<List<CardModel>> get() = _selectedCards

    fun selectCard(card: CardModel) {
        val currentList = _selectedCards.value?.toMutableList() ?: mutableListOf()
        currentList.add(card)
        _selectedCards.value = currentList
    }

    fun resetSelection() {
        _selectedCards.value = emptyList()
    }
}