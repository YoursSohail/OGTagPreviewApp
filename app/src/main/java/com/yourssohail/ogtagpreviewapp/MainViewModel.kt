package com.yourssohail.ogtagpreviewapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _ogTagData = MutableStateFlow<OGTagData?>(null)
    val ogTagData: StateFlow<OGTagData?> = _ogTagData

    private val ogTagService = OGTagService()

    fun fetchOGTags(url: String) {
        viewModelScope.launch {
            _ogTagData.value = ogTagService.fetchOGTags(url)
        }
    }
}