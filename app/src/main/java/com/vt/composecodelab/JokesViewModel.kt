package com.vt.composecodelab

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vt.ApiResponse
import com.vt.domain.ResultItem
import com.vt.repository.JokesInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class JokesViewModel @Inject constructor(private val jokesInteractor: JokesInteractor) :
    ViewModel() {
    private val _uiState = MutableStateFlow<ApiResponse<List<ResultItem>>>(ApiResponse.Empty)
    val uiState: StateFlow<ApiResponse<List<ResultItem>>> = _uiState

    fun searchJokes(query: String?) {
        viewModelScope.launch {
            jokesInteractor.searchJokes(query)
        }
    }
}